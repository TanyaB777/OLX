package hw_9.task3;

public class Person {
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static Person instance;

    private Person() {
    }

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }

        return instance;
    }

    public static Person getInstance(String name, String surname, int age) {
        if (instance == null) {
            instance = new Person();

            instance.name = name;
            instance.surname = surname;
            instance.age = age;
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "} Hash code: " + hashCode();
    }
}
