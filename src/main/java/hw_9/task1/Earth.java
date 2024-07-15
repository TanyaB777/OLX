package hw_9.task1;

public class Earth implements Planet {
    private static final String NAME = "Earth";

    @Override
    public void displayInfo() {
        Planet.super.displayInfo();
        System.out.println("3" + Planet.fromSun + NAME);
    }
}
