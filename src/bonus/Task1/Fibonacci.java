package bonus.Task1;

import java.util.Scanner;

public class Fibonacci {

    public void fibonacciIteration() {

        Scanner sc = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci();
        int fiboIter = 0;
        int fibNum = 0;
        boolean retry = false;

        System.out.println("The program shows the n'th number of Fibonnaci string");
        System.out.println("Write number:");

        do {
            try {
                sc = new Scanner(System.in);
                fibNum = sc.nextInt();
                retry = false;
            } catch (Exception e) {
                System.out.println("It's not valid value, try again..");
                retry = true;
            }
        } while (retry == true);

        System.out.println("Fibonacci at " + fibNum + "'th line is: " + init(fibNum));

    }

    public int init(int n) {
        int first = 1;
        int second = 1;
        int number = 1;

        for (int i = 2; i < n; i++) {
            number = first + second;
            first = second;
            second = number;
        }
        return number;
    }

}
