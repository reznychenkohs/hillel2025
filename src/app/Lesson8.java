package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
public static void main(String[] args) {
    createArray();
    insertionSort();
    binarySearch();
}

static int[] array = new int[15];
    public static void createArray(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) +1;
        }
        System.out.println("Початковий вигляд масиву:" + Arrays.toString(array));
    }
    public static void insertionSort() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }

    public static int binarySearch() {
        System.out.println("Введіть число для пошуку: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println("Індекс числа " + target + " у відсортованому масиві: " + mid);
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target integer not found");
        return -1;
    }
}
