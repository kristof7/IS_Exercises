package Task21;

import java.util.Scanner;

public class Task21 {

    public static void task21() {

        System.out.println("Write a number and i will check if the value you input is valid");
        System.out.println("You can input floating point numbers");
        exception();

    }

    private static void exception() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write number:");
            double number = scanner.nextDouble();
            System.out.println("Your input is valid");
        } catch (Exception e) {
            System.out.println("Value is not valid, try again:");
            exception();
        }
    }
}