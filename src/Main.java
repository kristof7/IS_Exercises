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

    }
}
