package hw_9.task1;

public class Venus implements Planet {
    String name = "Venus";

    @Override
    public void displayInfo() {
        System.out.println("2" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}