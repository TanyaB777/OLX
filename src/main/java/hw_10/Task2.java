package hw_10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 3, 9, 2, -11, 8, 6, 9, 45, 54, -789, 7);
        System.out.println(integerList);

        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) + 3);
        }
        System.out.println(integerList);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        integerList.sort(comparator);
        System.out.println(integerList);

        //integerList.sort(Collections.reverseOrder());
        //System.out.println(integerList);
    }
}
