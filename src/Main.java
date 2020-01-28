import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        isEven(2);
        isEven(13);
        isEven(17);
        isEven(36);

    }

    public static void isEven(Integer number) {

        int nCase = number % 2;
        switch (nCase){
            case 0:
                if(nCase == 0)
                    System.out.println("Number "+number+" is even");
                    break;
            case 1:
                if(nCase != 0)
                    System.out.println("Number "+number+" is not even");
                    break;

        }
    }
}

