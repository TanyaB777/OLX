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

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);
        peopleList.add(person5);

        System.out.println("List of persons:");
        System.out.println(peopleList);


        List<String> peopleUnder70 = peopleList.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .toList();

        System.out.println(peopleUnder70);

    }
}
