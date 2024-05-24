package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_4;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Area: " + circle.calculateArea(3));
        System.out.println("Perimeter: " + circle.calculatePerimeter(3));
        System.out.println();
        System.out.println("Circle 2:");
        System.out.println("Area: " + circle.calculateArea(5));
        System.out.println("Perimeter: " + circle.calculatePerimeter(5));
        System.out.println();
        System.out.println("Circle 3:");
        System.out.println("Area: " + circle.calculateArea(2));
        System.out.println("Perimeter: " + circle.calculatePerimeter(2));
    }
}
