package hw_9.task3;

public class Program {
    public static void main(String[] args) {

        Person person = Person.getInstance("Mark", "Twen", 40);

        System.out.println(person);

        person = Person.getInstance();

        System.out.println(person);

    }
}
