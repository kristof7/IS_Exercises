package Task29S;

import Classes.Car;
import Classes.CarFactory;

import java.util.HashSet;
import java.util.Set;

public class Task29S {
    public static void task29S() {

        Car car1 = CarFactory.prepareCar("Ford", 100, 80, 100);
        Car car2 = CarFactory.prepareCar("Jaguar", 250, 100, 300);
        Car car3 = CarFactory.prepareCar("Mercedes", 220, 90, 200);
        Car car4 = CarFactory.prepareCar("Jaguar", 250, 100, 300);

        Set<Car> carSet = putCarsIntoSet(car1, car2, car3, car4);
        System.out.println("Cars in car hashSet: " + carSet);

    }

    public static Set<Car> putCarsIntoSet(Car... cars) {
        Set<Car> carSet = new HashSet<>();
        for (Car car : cars) {
            carSet.add(car);
        }
        return carSet;
    }

}
