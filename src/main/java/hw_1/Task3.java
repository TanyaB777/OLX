package hw_1;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("--- Task 3 ---");
        System.out.printf("a=%d, b=%d\n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a=%d, b=%d", a, b);
    }
}
