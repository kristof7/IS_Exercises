package Classes;

public class CarFactory {

    public static Car prepareCar(String name, Integer maxSpeed, Integer capacity, Integer power) {
        Car car = new Car();
        car.setName(name);
        car.setMaxSpeed(maxSpeed);
        Engine engine = new Engine();
        engine.setPower(power);
        engine.setCapacity(capacity);
        car.setEngine(engine);

        return car;
    }
}
