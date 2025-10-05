package app;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = scanner.nextInt();

        double taxRate;

        if (income >= 0 & income <= 10000) {
            taxRate = 2.5;
        } else if (income > 10000 & income <= 25000) {
            taxRate = 4.3;
        } else taxRate = 6.7;

        double taxSum = ((income * taxRate) / 100);

        String template = "Tax sum is: %.2f";

        System.out.printf(template, taxSum);
    }
}


