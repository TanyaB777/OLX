package hw_9.task1;

public interface Planet {

    final String fromSun = " from the SUN: ";

    default void displayInfo() {
        System.out.println(this.getClass().toString());
    }

    ;
}