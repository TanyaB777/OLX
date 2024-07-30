package hw_10;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");

        System.out.println("Original List: " + list);

        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println("List after removing 1: " + list);

        list.set(0, "Hello");
        list.set(list.size() - 1, "World");
        System.out.println("List after setting: " + list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (!list.get(i).equals("Hello") && !list.get(i).equals("World")) {
                list.remove(i);
            }
        }

        System.out.println("List after removing 2: " + list);

        String result = String.join(" ", list);
        System.out.println("String: " + result);

    }

}
