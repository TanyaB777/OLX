package hw_10;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Person(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
}
