package hw_7;

abstract class Figure {

    public abstract double getArea();

    public abstract double getPerimeter();

}

// Square
class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

// Triangle
class Triangle extends Figure {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

// Circle
class Circle extends Figure {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + getArea() + ", perimeter=" + Math.round(getPerimeter() * 100.0) / 100.0 + "]";
    }
}