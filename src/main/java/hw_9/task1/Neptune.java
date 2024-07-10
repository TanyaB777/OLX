package hw_9.task1;

public class Neptune implements Planet {
    String name = "Neptune";

    @Override
    public void displayInfo() {
        System.out.println("8" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
