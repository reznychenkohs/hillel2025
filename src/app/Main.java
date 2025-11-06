package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter rectangle height: ");
        double heightRectangle = scanner.nextDouble();

        System.out.println("Enter circle radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Enter triangle base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter triangle height: ");
        double heightTriangle = scanner.nextDouble();


        Shape[] shapes = {
                new Rectangle(width, heightRectangle),
                new Circle(radius),
                new Triangle(base, heightTriangle)
        };

        double totalArea = ShapeComponent.areaSum(shapes);

        System.out.printf("Total area: %.2f\n", totalArea);
    }
}
