package hw_6;

public class Task1 {

    private int x = 3;
    private int y = 4;

    private static int x1 = 5;
    private static int y1 = 8;

    public void nonStaticMethod() {
        System.out.println("Non Static");
        System.out.printf("x = %d y = %d \n", x, y);

        x = 10;
        y = 15;

        System.out.printf("x = %d y = %d", x, y);
    }

    public static void staticMethod() {
        System.out.println("\nStatic");
        System.out.printf("x = %d y = %d \n", x1, y1);

        x1 = 10;
        y1 = 15;

        System.out.printf("x = %d y = %d", x1, y1);

        //java: non-static variable x cannot be referenced from a static context
        //System.out.printf("x = %d y = %d", x, y);
    }

}
