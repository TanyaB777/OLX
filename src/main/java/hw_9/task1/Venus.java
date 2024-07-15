package hw_9.task1;

public class Venus implements Planet {
    private final String name = "Venus";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("2" + Planet.fromSun + name);
    }
}