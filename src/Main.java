import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String [] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setName("car1");
        car2.setName("car2");
        car1.setMaxSpeed(100);
        car2.setMaxSpeed(200);

        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            car1.setName("faster car");
            System.out.println("Car1 is "+ car1.getName());
        }
        else {
            car2.setName("faster car");
            System.out.println("Car2 is "+ car2.getName());
        }
    }
}
