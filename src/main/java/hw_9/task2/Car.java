package hw_9.task2;

public class Car {
    private String model;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    private Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.price = carBuilder.price;
        this.maxSpeed = carBuilder.maxSpeed;
        this.countOfWheels = carBuilder.countOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }

    public static class CarBuilder {
        private String model;
        private double price;
        private int maxSpeed;
        private int countOfWheels;


        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
