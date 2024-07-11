package hw_9.task2;

public class Prog {

    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .setModel("BMW")
                .setPrice(12000.00)
                .setMaxSpeed(150)
                .setCountOfWheels(5)
                .build();

        System.out.println(car);

    }

}
