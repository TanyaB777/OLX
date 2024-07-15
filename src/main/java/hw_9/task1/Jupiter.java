package hw_9.task1;

public class Jupiter implements Planet {
    private final String name = "Jupiter";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("5" + Planet.fromSun + name);
    }
}
