package hw_10;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 72, 30000);
        Person person2 = new Person("Jane", "Smith", 75, 30200);
        Person person3 = new Person("Alice", "Johnson", 65, 30500);
        Person person4 = new Person("Bob", "Brown", 50, 20800);
        Person person5 = new Person("Charlie", "Davis", 40, 40000);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        System.out.println("List of persons:");

        for (Person person : people) {
            System.out.println(person);
        }

        List<String> namesUnder70 = people.stream()
                .filter(person -> person.getAge() < 70)
                .map(person -> person.getName())
                .toList();

        System.out.println(namesUnder70);

        //for (String name : namesUnder70) {
        //    System.out.println(name);
        //}
    }
}
