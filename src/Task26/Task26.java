package Task26;

import Task25.Cat2;
import Task25.Dog2;

public class Task26 {
    public static void task26() {

        Cat2 cat2 = new Cat2();
        Dog2 dog2 = new Dog2();

        cat2.defaultImplementation();
        dog2.defaultImplementation();

        System.out.println("Yes, default method in Interface can be override");

    }
}
