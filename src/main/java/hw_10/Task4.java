package hw_10;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 6, 9, 3, 5, 1, 6, 8, 6, 4, 4, 4};
        Set<Integer> set = new HashSet<>();

        for (int num : numbers) {
            set.add(num);
        }

        System.out.println("Set elements: " + set);

        List<Integer> list = new ArrayList<>(set);

        System.out.println("List elements: " + list);

        list.clear();

        System.out.println("Length of list: " + list.size());
    }
}
