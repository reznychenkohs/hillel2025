package app;

public class Lesson2 {
        public static void main(String[] args) {

            int OrderNumber1 = 1;
            String Name1 = "Alice";
            String Product1 = "smartphone";
            double Price1 = 305.99;
            String Street1 = "Moon Street";
            int HouseNumber1 = 10;

            int OrderNumber2 = 2;
            String Name2 = "Tom";
            String Product2 = "laptop";
            double Price2 = 570.95;
            String Street2 = "Terra Street";
            int HouseNumber2 = 17;
            String Currency = "EUR";

            System.out.println("Order No " + OrderNumber1 + " Client: " + Name1 + ".");
            System.out.println("Product: " + Product1 + ",");
            System.out.println("price " + Currency + " " + Price1 + ".");
            System.out.println("Address: " + Street1 + ", " + HouseNumber1 + ".");

            System.out.println("Order No " + OrderNumber2 + " Client: " + Name2 + ".");
            System.out.println("Product: " + Product2 + ",");
            System.out.println("price " + Currency + " " + Price2 + ".");
            System.out.println("Address: " + Street2 + ", " + HouseNumber2 + ".");
        }
    }
