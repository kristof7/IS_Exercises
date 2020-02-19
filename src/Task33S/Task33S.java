package Task33S;

import Classes.Car;
import Classes.CarFactory;

import java.util.*;

public class Task33S {
    public static void task33() {

        Car car1 = CarFactory.prepareCar("Ford", 100, 80, 100);
        Car car2 = CarFactory.prepareCar("Jaguar", 250, 100, 300);
        Car car3 = CarFactory.prepareCar("Mercedes", 220, 90, 200);
        Car car4 = CarFactory.prepareCar("Jaguar", 250, 100, 300);


        Map<Integer, List<Car>> integerListMap = putCarsIntoMap(car1, car2, car3, car4);
        System.out.println("Number of different cars: " + integerListMap.keySet().size());

        for (Integer i : integerListMap.keySet()) {
            System.out.println("Capacity: " + i + ". Number of engines " + integerListMap.get(i).size());
        }

    }

    public static Map<Integer, List<Car>> putCarsIntoMap(Car... cars) {
        Map<Integer, List<Car>> result = new HashMap<>();

        List<Car> carsList = new ArrayList<>();

        for (Car car : cars) {
            //Get capacity from car
            Integer capacity = car.getEngine().getCapacity();
            //Blank list if no key
            result.putIfAbsent(capacity, new ArrayList<>());
            //use letter for capacity
            carsList = result.get(capacity);
            //add next car object
            carsList.add(car);
            //override map, new list for capacity
            result.put(capacity, carsList);

        }
        return result;
    }
}
