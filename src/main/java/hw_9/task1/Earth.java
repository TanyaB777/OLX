package hw_9.task1;

public class Earth implements Planet {
    String name = "Earth";

    @Override
    public void displayInfo() {
        System.out.println("3" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
