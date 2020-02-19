package Classes;

import Task18.Color;
import Task24.Vehicle;

import java.util.Objects;

public class Car extends Vehicle {
    private String name;
    private int maxSpeed;
    private Engine engine;
    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public Car() {

    }

    //-----------Getters & setters-----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //-----------Equals & HashCode-----------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                name.equals(car.name) &&
                engine.equals(car.engine) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed, engine, color);
    }
}
