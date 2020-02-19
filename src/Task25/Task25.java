package Task25;

import Task23.Cat;

public class Task25 {
    public static void task25() {

        Cat2 cat2 = new Cat2();
        Dog2 dog2 = new Dog2();
        System.out.println("--Cat implements and overrides eat method from Animal Interface:");
        cat2.eat();
        System.out.println("--Dog implements and overrides eat method from Animal Interface:");
        dog2.eat();

    }
}
