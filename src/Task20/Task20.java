package Task20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task20 {

    public static void task20() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program check number of words by space between them");
        System.out.println("The program only checks words separated by a single space, longer space may cause some problems with calculations");
        System.out.println("Write some text and I will show you the number of words:");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println("In text are " + words.length + " words");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
