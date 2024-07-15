package hw_9.task1;

public class Jupiter implements Planet {
    private static final String NAME = "Jupiter";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("5" + Planet.fromSun + NAME);
    }
}
