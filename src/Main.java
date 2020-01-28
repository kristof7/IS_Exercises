import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String [] args) {

        Car car1 = new Car();
        car1.setName("autoS");
        car1.setMaxSpeed(200);
        car1.getEngine();

        System.out.println("Car1 name: "+car1.getName());
        System.out.println("Car1 max speed: "+car1.getMaxSpeed());
        System.out.println("Car1 engine: "+car1.getEngine());

        Engine engine1 = new Engine();
        engine1.setPower(150);
        engine1.setCapacity(3000);

        System.out.println("Engine1 power: "+engine1.getPower());
        System.out.println("Engine1 capacity: "+engine1.getCapacity());

    }
}
