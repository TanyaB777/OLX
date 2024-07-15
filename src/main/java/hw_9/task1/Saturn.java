package hw_9.task1;

public class Saturn implements Planet {
    private final String name = "Saturn";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("6" + Planet.fromSun + name);
    }
}
