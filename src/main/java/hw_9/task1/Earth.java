package hw_9.task1;

public class Earth implements Planet {
    private final String name = "Earth";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("3" + Planet.fromSun + name);
    }
}
