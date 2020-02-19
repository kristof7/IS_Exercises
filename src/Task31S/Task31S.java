package Task31S;

import Classes.Car;
import Classes.CarFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task31S {
    public static void task31() {

        Car car1 = CarFactory.prepareCar("Ford", 100, 80, 100);
        Car car2 = CarFactory.prepareCar("Jaguar", 250, 100, 300);
        Car car3 = CarFactory.prepareCar("Mercedes", 220, 90, 200);
        Car car4 = CarFactory.prepareCar("Jaguar", 250, 100, 300);

        List<Car> carList = putCarsIntoList(car1, car2, car3, car4);
        System.out.println("Cars in car list: " + carList);

    }

    public static List<Car> putCarsIntoList(Car... cars) {
        return new ArrayList<>(Arrays.asList(cars));
    }
}
