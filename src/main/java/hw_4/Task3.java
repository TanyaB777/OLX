package hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String strInput = "Роняє ліс багряний свій убір,\n" +
                "Срібне мороз, що в'януло поле,\n" +
                "Прогляне день ніби мимоволі\n" +
                "І сховається за край окружних гір\n";
        String strFind;
        int countSubstring = 0;
        int findIndex = 0;
        int fromIndex = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(strInput);
        System.out.print("Enter a search substring: ");
        strFind = scanner.nextLine();
        scanner.close();

        if (strFind.isEmpty())
            System.out.println("Substring is empty");
        else {
            while ((findIndex = strInput.toLowerCase().indexOf(strFind.toLowerCase(), fromIndex)) >= 0) {
                fromIndex = findIndex + 1;
                countSubstring++;
            }
            System.out.println("Count of the search substring: " + countSubstring);
        }
    }
}
