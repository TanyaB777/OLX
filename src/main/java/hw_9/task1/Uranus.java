package hw_9.task1;

public class Uranus implements Planet {
    private static final String NAME = "Uranus";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("7" + Planet.fromSun + NAME);
    }
}
