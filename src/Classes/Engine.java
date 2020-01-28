package Classes;

public class Engine {
    public int power;
    public int capacity;

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

}
