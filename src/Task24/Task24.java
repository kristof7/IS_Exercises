package Task24;

import Classes.Car;

public class Task24 {
    public static void task24() {

        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        car.setId(12345);
        vehicle.setId(98765);

        System.out.println("Car's id is: " + car.getId());
        System.out.println("Vehicles's id is: " + vehicle.getId());

    }
}
