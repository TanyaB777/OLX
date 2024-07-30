package hw_3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //Task 1
        int[] digArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int i = 0; i < digArray.length; i++) {
            digArray[i] = i;
        }

        System.out.println(Arrays.toString(digArray));

        //Task 2
        double[] doubleArray = new double[5];
        doubleArray[0] = 0.1;
        doubleArray[1] = 0.2;
        doubleArray[2] = 0.3;
        doubleArray[3] = 0.4;
        doubleArray[4] = 0.5;

        System.out.println(Arrays.toString(doubleArray));

        //Task 3
        byte bValue = 1;
        int intValue = 2;
        long longValue = 3;

        int[] iArray = new int[3];

        iArray[0] = bValue;
        iArray[1] = intValue;
        iArray[2] = (int) longValue;

        System.out.println(Arrays.toString(iArray));

        //Task 4
        int[][] twArray = new int[3][];

        twArray[0] = new int[]{0, 1, 2};
        twArray[1] = new int[]{4, 5, 6, 7, 8};
        twArray[2] = new int[]{9, 10};

        for (int i = 0; i < twArray.length; i++) {
            System.out.println(Arrays.toString(twArray[i]));
        }

    }
}
