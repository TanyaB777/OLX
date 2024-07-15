package hw_9.task1;

public class Mars implements Planet {
    private final String name = "Mars";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("4" + Planet.fromSun + name);
    }
}
