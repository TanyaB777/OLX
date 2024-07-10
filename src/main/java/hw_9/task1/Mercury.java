package hw_9.task1;

public class Mercury implements Planet {
    String name = "Mercury";

    @Override
    public void displayInfo() {
        System.out.println("1" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}