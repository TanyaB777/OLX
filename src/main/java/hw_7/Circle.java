package hw_7;

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