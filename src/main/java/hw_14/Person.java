package hw_14;

import java.util.ArrayList;
import java.util.List;

//@Bean("myBean")
public class Person {

    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Deprecated
    //This method is no longer recommended for use.
    public void methodOld() {
        System.out.println("This method is deprecated.");
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @SafeVarargs
    public static <T> List<T> mergeLists(List<T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

}
