package app;

public class Lesson6 {
    public static void main(String[] args) {

        int sum=0;
        int count =1;

        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.println(count++ +") Num is " + i + ", " + "sum is " + sum);
        }
            System.out.println(
                            """
                ----------------------
                Sum of numbers is\s""" + sum);

    }
}
