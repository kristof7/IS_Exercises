package Task19;

public class Task19 {

    public static void task19() {

        int firstNumber = 4;
        tables(firstNumber);

    }

    private static void tables(int number) {

        int[] table = new int[number + 10];

        for (int i = number; i < number + table.length; i++) {
            table[i] = i;
            System.out.println(i);
        }
    }
}
