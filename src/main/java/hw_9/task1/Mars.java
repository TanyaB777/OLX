package hw_9.task1;

public class Mars implements Planet {
    String name = "Mars";

    @Override
    public void displayInfo() {
        System.out.println("4" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
