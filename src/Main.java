import Classes.Calculator;
import Classes.Car;
import Classes.Engine;
import Classes.StaticExample;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tekstA = "tekst";
        String tekstB = "tekst";

        if (tekstA == tekstB) {
            System.out.println("tekstA hashcode: "+tekstA.hashCode());
            System.out.println("tekstB hashcode: "+tekstB.hashCode());
        }
        if (tekstA.equals(tekstB)) {
            System.out.println("tekstA hashcode: "+tekstA.hashCode());
            System.out.println("tekstB hashcode: "+tekstB.hashCode());
        }
    }
}


