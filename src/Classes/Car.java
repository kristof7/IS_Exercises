package Classes;

public class Car {
    private String name;
    private int maxSpeed;
    private Engine engine;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(name);
    }
    //-----------Gettery i settery-----------
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
}
