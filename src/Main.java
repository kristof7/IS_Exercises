import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Aplication that sum two variables");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");   //add first variable
        double variable1 = scanner.nextDouble();
        System.out.println("Input second number: ");  //add second variable
        double variable2 = scanner.nextDouble();
        double sum = variable1 + variable2;           //sum the variables
        System.out.println("The sum of "+variable1+" and "+variable2+" is "+sum);


    }
}


