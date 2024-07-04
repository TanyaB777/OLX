package hw_7;

public class Program {

    public static void main(String[] args) {
        Figure square = new Square(15);
        Figure triangle = new Triangle(3, 4, 3, 4, 5);
        Figure circle1 = new Circle(10);
        Figure circle2 = new Circle(25);

        System.out.println(square);
        System.out.println(triangle);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
