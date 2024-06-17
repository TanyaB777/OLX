package hw_2;

public class Task1 {
    public static void main(String[] args) {
        // +
        int a = 10;
        int b = 5;
        int c = a+b;
        System.out.printf("%d+%d=%d\n", a, b, c);
        // -
        a = 20;
        b = 3;
        c = a-b;
        System.out.printf("%d-%d=%d\n", a, b, c);
        // *
        a = 2;
        b = 2;
        c = a*b;
        System.out.printf("%d*%d=%d\n", a, b, c);
        // /
        a = 10;
        b = 5;
        c = a/b;
        System.out.printf("%d/%d=%d\n", a, b, c);
        double  d = 9.5/5;
        System.out.printf("9.5/5=%.2f\n", d);
        // %
        a = 29;
        b = 3;
        c = a%b;
        System.out.printf("%d%%%d=%d\n", a, b, c);
        // ++
        a = 1;
        System.out.println("prefix increment");
        System.out.println("a=" + a);
        b = ++a;
        System.out.println("b=++a");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // ++
        a = 1;
        System.out.println("postfix increment");
        System.out.println("a=" + a);
        b = a++;
        System.out.println("b=a++");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // --
        a = 8;
        System.out.println("prefix decrement");
        System.out.println("a=" + a);
        b = --a;
        System.out.println("b=--a");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // --
        a = 8;
        System.out.println("postfix decrement");
        System.out.println("a=" + a);
        b = a--;
        System.out.println("b=a--");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        //priority
        a = 3;
        b = 7;
        c = a + 2 * ++b;
        System.out.println("priority");
        System.out.println(c);
        c = (a + 2) * ++b;
        System.out.println(c);
        //double type
        double e = 2.0 - 1.1;
        System.out.println("accuracy for a double type");
        System.out.println(e);
    }
}
