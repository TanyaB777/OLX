package hw_9.task1;

public class Mercury implements Planet {
    private static final String NAME = "Mercury";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("1" + Planet.fromSun + NAME);
    }
}