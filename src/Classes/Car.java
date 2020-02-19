package Classes;

import Task18.Color;

public class Car {
    private String name;
    private int maxSpeed;
    private Engine engine;
    private Color color;

    public Car(Color color) {
        this.color = color;
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
}
