package Task32S;

import java.util.HashMap;
import java.util.Map;

public class Task32S {
    public static void task32() {

        Integer firstInteger = 1;
        Integer secondInteger = 2;
        Integer thirdInteger = 1;
        Integer fourthInteger = 3;

        String firstString = "a";
        String secondString = "b";
        String thirdString = "c";
        String fourthString = "a";

        Map<Integer, String> maps = new HashMap<>();
        maps.put(firstInteger, firstString);
        maps.put(secondInteger, secondString);
        maps.put(thirdInteger, thirdString);
        maps.put(fourthInteger, fourthString);


        System.out.println("Maps: " + maps);

        System.out.println("Map at number 1 is: " + maps.get(1));

    }
}
