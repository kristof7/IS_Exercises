package Task30S;

import Classes.Car;
import Classes.CarFactory;
import Classes.Engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task30S {
    public static void task30() {

        Engine engine = new Engine();
        Car car1 = new Car();
        car1.setName("Jaguar");
        car1.setMaxSpeed(250);
        car1.setEngine(engine);
        Car car2 = new Car();
        car2.setName("Ford");
        car2.setMaxSpeed(150);
        car2.setEngine(engine);
        Car car3 = new Car();
        car3.setName("Mercedes");
        car3.setMaxSpeed(240);
        car3.setEngine(engine);
        Car car4 = new Car();
        car4.setName("Ford");
        car4.setMaxSpeed(150);
        car4.setEngine(engine);


        List<Car> carList = putCarsIntoList(car1, car2, car3, car4);
        System.out.println("Number of cars in the list: " + carList.size());

    }

    public static List<Car> putCarsIntoList(Car... cars) {
        return new ArrayList<>(Arrays.asList(cars));
    }
//    public static List<Car> putCarsIntoList(Car... cars) {
//        List<Car> carList = new ArrayList<>();
//        for (Car car : cars) {
//            carList.add(car);
//        }
//        return carList;
//    }
}
