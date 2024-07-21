package hw_11;

import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {

        Deque<Car> carDeque = new LinkedList<>();

        //2 sides

        carDeque.addLast(new Car("Chevrolet", "Malibu", 2019));
        carDeque.addLast(new Car("BMW", "3 Series", 2018));
        carDeque.addLast(new Car("Audi", "A4", 2017));

        System.out.println("addLast");
        System.out.println(carDeque);

        carDeque.addFirst(new Car("Toyota", "Corolla", 202));
        carDeque.addFirst(new Car("Honda", "Civic", 2021));
        carDeque.addFirst(new Car("Ford", "Focus", 2020));

        System.out.println("addFirst");
        System.out.println(carDeque);

        Car car;

        car = carDeque.peekLast();

        System.out.println("peekLast");
        System.out.println(car);
        System.out.println(carDeque);

        car = carDeque.peekFirst();

        System.out.println("peekFirst");
        System.out.println(car);
        System.out.println(carDeque);

        car = carDeque.pollLast();

        System.out.println("poolLast");
        System.out.println(car);
        System.out.println(carDeque);

        car = carDeque.pollFirst();

        System.out.println("poolFirst");
        System.out.println(car);
        System.out.println(carDeque);

        //1 side

        carDeque.push(new Car("Mercedes-Benz", "C-Class", 2016));
        carDeque.push(new Car("Hyundai", "Elantra", 2015));
        carDeque.push(new Car("Nissan", "Altima", 2014));

        System.out.println("push");
        System.out.println(carDeque);

        car = carDeque.pop();
        System.out.println("pop");
        System.out.println(car);
        System.out.println(carDeque);

        carDeque.push(new Car("Volkswagen", "Passat", 2013));

        System.out.println("push");
        System.out.println(carDeque);

        car = carDeque.pop();
        System.out.println("pop");
        System.out.println(car);
        System.out.println(carDeque);

    }
}
