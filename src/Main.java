import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        int newEngine = scanner.nextInt();

        Engine engine = new Engine();
        engine.setPower(newEngine);
        Car car1 = new Car();
        car1.setName(newName);
        car1.setEngine(engine);

        System.out.println("Car name: "+car1.getName());
        System.out.println(car1.getName()+"'s"+" engine power: "+engine.getPower());

    }
}


