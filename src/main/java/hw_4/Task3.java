package hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String strInput = "Роняє ліс багряний свій убір,\n" +
                "Срібне мороз, що в'януло поле,\n" +
                "Прогляне день ніби мимоволі\n" +
                "І сховається за край окружних гір\n";
        String strFind;
        int countSubstring = 0;
        int foundSubstringIndex = 0;
        int fromIndexToSearch = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(strInput);
        System.out.print("Enter a search substring: ");
        strFind = scanner.nextLine();
        scanner.close();

        if (strFind.isEmpty())
            System.out.println("Substring is empty");
        else {
            while ((foundSubstringIndex = strInput.toLowerCase().indexOf(strFind.toLowerCase(), fromIndexToSearch)) >= 0) {
                fromIndexToSearch = foundSubstringIndex + 1;
                countSubstring++;
            }
            System.out.println("Count of the search substring: " + countSubstring);
        }
    }
}
