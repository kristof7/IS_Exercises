package Classes;

public class Engine {
    private int power;
    private int capacity;

    public Engine() {
    }
    public Engine(int power, int capacity) {
        this.power = power;
        this.capacity = capacity;
    }
    public void printPower() {
        System.out.println(power);
    }
    public void printCapacity() {
        System.out.println(capacity);
    }
    //-----------Gettery i settery-----------
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
