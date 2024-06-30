package hw_5.myCity;

import hw_5.myClass.*;

public class Building {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Person("Maria", "Kiruuenko", "096743543", "maria@google.com", 30);
        persons[1] = new Person("Taras", "Koval", "050743543", "taras@google.com", 34);
        persons[2] = new Person("Oksana", "Chobotok", "093743553", "oksana@google.com", 24);

        System.out.println("Task 1");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        //Task 2
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;

        System.out.println("Task 2");
        System.out.println("a1 = " + a1.x);
        System.out.println("a2 = " + a2.x);

        a1.x = 10;

        System.out.println("a1 = " + a1.x);
        System.out.println("a2 = " + a2.x);

        //Task 3
        Point[] points = {new Point(2, 3), new Point(5, 7),
                new Point(4, 16), new Point(8, 12)};

        System.out.println("Task 3");
        System.out.println("All points:");
        for (Point point : points) {
            System.out.println(point.info());
        }

        System.out.println("Even points:");
        for (Point point : points) {
            if ((point.x % 2 == 0) && (point.y % 2 == 0))
                System.out.println(point.info());
        }
    }
}
