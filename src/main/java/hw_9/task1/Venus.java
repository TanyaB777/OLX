package hw_9.task1;

public class Venus implements Planet {
    private static final String NAME = "Venus";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("2" + Planet.fromSun + NAME);
    }
}