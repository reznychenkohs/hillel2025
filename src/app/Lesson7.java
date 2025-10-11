package app;

import java.util.Arrays;
import java.util.Random;

public class Lesson7 {

    public static void main(String[] args) {
        сreateArray();
        calculateSumOfNegativeIntegers();
        calculateNumberPairedNumbers();
        calculateNumberOfOddNumbers();
        findMinElement();
        findMaxElement();
        calculateAverageAfterFirstNegativeNumber();
    }

    static int[] array = new int[20];
    public static void сreateArray() {

        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
                array[i] = random.nextInt(201) - 100;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void calculateSumOfNegativeIntegers() {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + sum);
    }

    public static void calculateNumberPairedNumbers() {

        int NumberOfPairedNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                NumberOfPairedNumbers++;
            }
        }
        System.out.println("Кількість парних чисел: " + NumberOfPairedNumbers);
    }

    public static void calculateNumberOfOddNumbers() {

        int NumberOdOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                NumberOdOddNumbers++;
            }
        }
        System.out.println("Кількість непарних чисел: " + NumberOdOddNumbers);
    }

    public static void findMinElement() {

        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex+ ")");
    }

    public static void findMaxElement() {

        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
    }

    public static void calculateAverageAfterFirstNegativeNumber() {

        int i = 0;
        while (i < array.length && array[i] > 0 ){
            i++;
        }

        int sum = 0;
        int count = 0;
        for (i =i+1; i < array.length; i++) {
                sum += array[i];
                count++;
        }
        double average = (double) sum / count;
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);
    }
}



