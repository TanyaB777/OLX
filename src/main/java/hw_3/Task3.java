package hw_3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Task 1
        String str = "Hello world!";

        System.out.printf("First char: %c, last char: %c\n", str.charAt(0), str.charAt(str.length() - 1));

        //Task 2
        char[] charString = str.substring(str.indexOf('w'), str.length() - 1).toCharArray();
        System.out.println(Arrays.toString(charString));
        System.out.println(charString[charString.length - 2]);

        //Task 3
        int a = 1;
        int b = 0;

        //prefix increment
        System.out.println("prefix increment");
        System.out.println("a=" + a);
        b = ++a;
        System.out.println("b=++a");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        //postfix increment
        a = 1;
        b = 0;

        System.out.println("postfix increment");
        System.out.println("a=" + a);
        b = a++;
        System.out.println("b=a++");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // prefix decrement
        a = 8;
        System.out.println("prefix decrement");
        System.out.println("a=" + a);
        b = --a;
        System.out.println("b=--a");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // postfix decrement
        a = 8;
        System.out.println("postfix decrement");
        System.out.println("a=" + a);
        b = a--;
        System.out.println("b=a--");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
