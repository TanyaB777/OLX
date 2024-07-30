package hw_9.task1;

public class Neptune implements Planet {
    private static final String name = "Neptune";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("8" + Planet.fromSun + name);
    }
}
