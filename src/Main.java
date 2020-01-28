import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String [] args) {

        Integer i = 6 * 7;
        Integer j = 7;
        j += i;

        System.out.println("(6 * 7) + (7 + (6 * 7)) = "+(j+i));

    }
}
