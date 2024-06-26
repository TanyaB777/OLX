package hw_5.myClass;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String info() {
        return "x = " + x + " y = " + y;
    }
}
