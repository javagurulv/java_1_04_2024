package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

public class CirckleCalculator {

    private static final double PI = Math.PI;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculatePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        double[] testRadii = {1, 2.5, 5, 10};

        for (double radius : testRadii) {
            double area = calculateArea(radius);
            double perimeter = calculatePerimeter(radius);
            System.out.println("Radius: " + radius + " -> Area: " + area + ", Perimeter: " + perimeter);
        }
    }
}
