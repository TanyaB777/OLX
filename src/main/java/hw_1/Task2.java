package hw_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int helper;

        System.out.println("--- Task 2 ---");
        System.out.printf("a=%d, b=%d\n", a, b);

        helper = a;
        a = b;
        b = helper;

        System.out.printf("a=%d, b=%d", a, b);
    }
}
