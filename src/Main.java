import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String [] args) {


        StaticExample nonStaticMethod = new StaticExample();
        nonStaticMethod.nonStaticMethod();
        StaticExample.staticMethod();


    }
}
