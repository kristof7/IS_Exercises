import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String [] args) {

        Calculator calculator = new Calculator();
        System.out.println("(integer)divide 20 / 10 = "+calculator.divide(20, 10));
        System.out.println("(integer)divide 7 / 2 = "+calculator.divide(7, 2));
        System.out.println("(integer)divide 100 / 23 = "+calculator.divide(100, 23));

    }
}
