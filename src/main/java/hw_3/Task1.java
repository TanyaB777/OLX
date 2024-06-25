package hw_3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Task 1
        double[] digArray = {3.43, 12.1212, 12.22, 2.29};
        String str = "";

        for (double i : digArray) {
            str += i + ";";
        }

        System.out.println(str.substring(0, str.length() - 1));

        //Task 2
        str = "Мама мила раму";
        String[] splitString = str.split(" ");
        System.out.println(Arrays.toString(splitString));

        //Task 3
        str = "Я хочу перенесення рядків.";
        str = str.replace(" ", "\n");
        System.out.println(str);
    }
}
