package hw_9.task1;

public interface Planet {

    String fromSun = " from the SUN: ";

    default void displayInfo() {
        System.out.print("This Planet is ");
    }
}