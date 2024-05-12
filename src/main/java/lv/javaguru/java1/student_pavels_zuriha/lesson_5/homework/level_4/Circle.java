package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_4;

import java.util.Scanner;

import static java.lang.Math.PI;

class Circle {

    double calculateArea(double radiusCircle) {
        return PI * radiusCircle * radiusCircle;
    }

    double calculatePerimeter(double radiusCircle) {
        return 2 * PI * radiusCircle;
    }

}



class CircleDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Enter radius: ");
        double radiusCircle = scanner.nextDouble();

        System.out.println("Circle Perimeter = " + circle.calculatePerimeter(radiusCircle));
        System.out.println("Circle Area = " + circle.calculateArea(radiusCircle));

    }

}
