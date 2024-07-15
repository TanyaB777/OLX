package hw_9.task1;

public class Uranus implements Planet {
    private final String name = "Uranus";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("7" + Planet.fromSun + name);
    }
}
