package Task23;

public class Task23 {
    public static void task23() {

        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("eat method in cat class(inherits from Animal)");
        cat.eat();
        System.out.println("\n" + "eat method in dog class(override from Animal)");
        dog.eat();
    }
}
