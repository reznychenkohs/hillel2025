package app;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введіть ціле число: ");
        squareOfTheNumber(scanner.nextInt());


        System.out.print("Введіть радіус: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();

        volumeOfTheCylynder(radius, height);


        System.out.print("Введіть розмір масиву: ");
        int arraySize = scanner.nextInt();
        int[] array = new int [arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        calculateSum(array);


        System.out.print("Введіть рядок: ");
        String string = scanner.nextLine();
        revertString(new String[]{string});


        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        exponentiation(a,b);


        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String str = scanner.nextLine();
        enterText(n, str);
    }

    public static void squareOfTheNumber (int a) {
        int square = a * a;
        System.out.println("Квадрат числа " + a + " дорівнює " + square);
    }

    public static void volumeOfTheCylynder(double radius, double height){
        double pi = 3.14159;
        double cylinderVolume = pi * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює "  + cylinderVolume + ".");
    }
    public static void calculateSum(int[]array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Масив чисел: " + Arrays.toString(array) + "\n" + "Сума всіх елементів масиву дорівнює " + sum + "." );
    }
    public static void revertString(String[] strings){
        System.out.print("Рядок в зворотньому порядку: ");
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    public static void exponentiation(int a, int b) {
       int exponentiation = (int) Math.pow(a,b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + exponentiation + ".");
    }

    public static void enterText(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}