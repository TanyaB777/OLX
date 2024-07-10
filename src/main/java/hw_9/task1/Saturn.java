package hw_9.task1;

public class Saturn implements Planet {
    String name = "Saturn";

    @Override
    public void displayInfo() {
        System.out.println("6" + Planet.fromSun + name);
        Planet.super.displayInfo();
    }
}
