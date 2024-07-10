package hw_9.task1;

public class Uranus implements Planet {
    String name = "Uranus";

    @Override
    public void displayInfo() {
        System.out.println("7" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
