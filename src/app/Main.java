package app;

public class Main {
    public static void main(String[] args) {

        double price1 = 205.99;
        int quantity1 = 59;
        double totalSales1 = price1 * quantity1;
        double salesPerDay1 = totalSales1 / 5;

        double price2 = 953.35;
        int quantity2 = 11;
        double totalSales2 = price2 * quantity2;
        double salesPerDay2 = totalSales2 / 7;

        String template = """
                Product № %d: %s,
                total sales for %d days is %s %.2f
                sales by day is %s %.2f
                """;

        String textProduct1 = template.formatted(
                1, "smartphone", 5,
                "EUR", totalSales1, "EUR", salesPerDay1);

        String textProduct2 = template.formatted(
                2, "laptop", 7,
                "EUR", totalSales2, "EUR", salesPerDay2);

                System.out.println(textProduct1);
                System.out.println(textProduct2);
  }
}
