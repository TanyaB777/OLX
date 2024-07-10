package hw_9.task1;

public class Jupiter implements Planet {
    String name = "Jupiter";

    @Override
    public void displayInfo() {
        System.out.println("5" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
