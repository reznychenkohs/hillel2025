package app;

public class ShapeComponent {

    public static double areaSum(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
