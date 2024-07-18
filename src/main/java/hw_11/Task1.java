package hw_11;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Map<String, Integer> integerMap = new HashMap<>();

        integerMap.put("Lina", 25);
        integerMap.put("Sveta", 30);
        integerMap.put("Igor", 35);
        integerMap.put("Nadya", 55);
        integerMap.put("Sergey", 32);
        integerMap.put("Andrey", 33);
        integerMap.put("Alex", 36);
        integerMap.put("Zoya", 21);
        integerMap.put("Evgen", 37);
        integerMap.put("Nikolay", 33);

        System.out.println(integerMap);

        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            System.out.printf("Ім’я людини: %s, Років: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
