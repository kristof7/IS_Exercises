import Classes.Car;
import Classes.Engine;

public class Main {

    public static void main(String [] args) {

        Engine engine1 = new Engine();
        engine1.capacity = 100;
        engine1.power = 2000;

        Engine engine2 = new Engine();
        engine2.capacity = 200;
        engine2.power = 3000;

        System.out.println("Engine 1 capacity: "+engine1.capacity);
        System.out.println("Engine 1 power: "+engine2.capacity);
        System.out.println("Engine 2 capacity: "+engine1.power);
        System.out.println("Engine 2 power: "+engine2.power);

        Car car1 = new Car();
        car1.name = "auto 1";
        car1.maxSpeed = 160;
        car1.engine = engine1;

        Car car2 = new Car();
        car2.name = "auto 2";
        car2.maxSpeed = 280;
        car2.engine = engine2;

        System.out.println("Car 1 name: "+car1.name);
        System.out.println("Car 1 max Speed: "+car1.maxSpeed);
        System.out.println("Car 1 engine capacity: "+car1.engine.capacity);
        System.out.println("Car 1 engine power: "+car1.engine.power);
        System.out.println("Car 2 name: "+car2.name);
        System.out.println("Car 2 max Speed: "+car2.maxSpeed);
        System.out.println("Car 2 engine capacity: "+car2.engine.capacity);
        System.out.println("Car 2 engine power: "+car2.engine.power);

        car1.printName();
        car2.printName();

        engine1.printPower();
        engine1.printCapacity();
        engine2.printPower();
        engine2.printCapacity();

    }
}
