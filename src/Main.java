import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        method(20);
    }

    public static void method(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 11 == 0) {
                break;
            }
            System.out.println(i + " / " + number + " is not even");
            System.out.println("Number 11 stops the loop!");
        }


    }
}


