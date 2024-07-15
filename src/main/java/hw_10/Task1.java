package hw_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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

        System.out.println("Original list: " + list);

        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println("After removing list: " + list);

        list.set(0, "Hello");
        list.set(list.size() - 1, "World");
        System.out.println("After setting list: " + list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (!str.equals("Hello") && !str.equals("World")) {
                iterator.remove();
            }
        }

        System.out.println("After removing list: " + list);

        //list.removeIf(s -> !(s.equals("Hello") || s.equals("World")));
        //System.out.println("After removing list: " + list);

        String result = String.join(" ", list);
        System.out.println("Final result: " + result);

        /*result = "";

        for (String str: list){
            result = result + " " + str;
        }

        result = result.trim();

        System.out.println("Final result: " + result);*/
    }

}
