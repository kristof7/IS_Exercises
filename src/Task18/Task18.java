package Task18;

import Classes.Car;

public class Task18 {

    public static void task18() {

        Car car1 = new Car(Color.BLACK);
        Car car2 = new Car(Color.RED);
        Car car3 = new Car(Color.WHITE);

        System.out.println("Cars colors created in enum class:");
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
        System.out.println(car3.getColor());

    }
}
