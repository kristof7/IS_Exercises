package Task17;

import java.util.Scanner;

public class Task17 {

    public static void task17() {

        //Dots counter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and I will show you the number of dots:");
        String text = scanner.nextLine();
        int dotsNumber = 0;
        String[] dots = text.split("");
        for (int i = 0; i < dots.length; i++) {
            if (dots[i].equals(String.valueOf('.'))) {
                dotsNumber++;
            }
        }
        System.out.println("Number of dots in text: " + dotsNumber);
    }
}
