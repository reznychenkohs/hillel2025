package app;

import java.util.Random;

public class Lesson9 {

    public static void main(String[] args) {
        createArray();
        sumEvenOddRows();
        multiplicationEvenOddColumns();
    }

    static int[][] array = new int[4][4];

    public static void createArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumEvenOddRows() {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (i % 2 == 0) {
                evenSum += rowSum;

            }
            if (!(i % 2 == 0)) {
                oddSum += rowSum;

            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenSum);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddSum);

    }

    public static void multiplicationEvenOddColumns() {
        long evenMultiplication = 1;
        long oddMultiplication = 1;

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (j % 2 == 0) {
                    evenMultiplication *= array[i][j];
                } else {
                    oddMultiplication *= array[i][j];

                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenMultiplication);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddMultiplication);
    }


    public static boolean magicMatrix(int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int targetSum = 0;

        for (int j = 0; j < array.length; j++) {
            targetSum += array[0][j];
        }
        return true;
    }
}





