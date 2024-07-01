package hw_6;

public class Task1 {
    public static void main(String[] args) {

        Task1 task = new Task1();
        task.NonStaticMethod();

        StaticMethod();

    }

    int x = 3;
    int y = 4;

    static int x1 = 5;
    static int y1 = 8;

    private void NonStaticMethod() {
        System.out.println("Non Static");
        System.out.printf("x = %d y = %d \n", x, y);

        x = 10;
        y = 15;

        System.out.printf("x = %d y = %d", x, y);
    }

    private static void StaticMethod() {
        System.out.println("\nStatic");
        System.out.printf("x = %d y = %d \n", x1, y1);

        x1 = 10;
        y1 = 15;

        System.out.printf("x = %d y = %d", x1, y1);

        //java: non-static variable x cannot be referenced from a static context
        //System.out.printf("x = %d y = %d", x, y);
    }

}
