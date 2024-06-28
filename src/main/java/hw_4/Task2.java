package hw_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String userInput;
        int userMin, userMax;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter series of integers separated by spaces: ");

        userInput = scanner.nextLine();
        scanner.close();
        String[] strArray = userInput.split(" ");

        int[] intArray = new int[strArray.length];

        try {
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Enter only series of integers separated by spaces!");
        }

        userMin = intArray[0];
        userMax = intArray[0];

        for (int i = 1; i < intArray.length; i++) {

            if (userMin > intArray[i]) {
                userMin = intArray[i];
            }

            if (userMax < intArray[i]) {
                userMax = intArray[i];
            }
        }

        System.out.printf("Min value: %d Max value: %d", userMin, userMax);
    }
}
