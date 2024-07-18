package hw_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Person> people = new HashMap<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("Яку операцію ви хочете виконати: getPerson/addPerson/exit? ");

            String operation = scanner.nextLine().trim().toLowerCase();

            switch (operation) {
                case "getperson":
                    getPerson();
                    break;
                case "addperson":
                    addPerson();
                    break;
                case "exit":
                    System.out.println("Програма завершена.");
                    return;
                default:
                    System.out.println("Невідома операція. Спробуйте ще раз.");
            }

        }
    }

    private static void getPerson() {
        System.out.print("Введіть прізвище людини: ");
        String surname = scanner.nextLine().trim().toUpperCase();

        if (people.containsKey(surname)) {
            System.out.println("Ви вибрали: " + people.get(surname));
        } else {
            if (people.isEmpty()) {
                System.out.println("Людей в списку немає. Спочатку додайте хоча б одну людину.");
            } else {
                System.out.println("Такої людини, яку ви ввели, не існує. Ви можете вибрати з таких прізвищ: " + String.join(", ", people.keySet()));
            }
        }
    }

    private static void addPerson() {

        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine().trim();

        if (people.containsKey(surname.toUpperCase())) {

            System.out.print("Ця людина вже існує. Бажаєте її замінити? (так/ні): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("так")) {
                System.out.println("Людину не було додано.");
                return;
            }
        }

        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine().trim();

        System.out.print("Введіть вік: ");

        String inputAge;
        int age = 0;

        do {
            System.out.print("Введіть вік: ");
            inputAge = scanner.nextLine().trim().toLowerCase();
            try {
                age = Integer.parseInt(inputAge);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введено не число. Будь ласка, введіть вік числом.");
            }
        } while (!inputAge.equals("exit"));

        if (inputAge.equals("exit"))
            return;

        Person person = new Person(surname, name, age);

        people.put(surname.toUpperCase(), person);

        System.out.println("Ви щойно додали " + person + " людину");

        ;
        ;
    }

}
