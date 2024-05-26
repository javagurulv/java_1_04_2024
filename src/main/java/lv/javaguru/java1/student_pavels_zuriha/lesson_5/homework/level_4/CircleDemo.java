package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_4;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CircleCalculator circle = new CircleCalculator();

        System.out.println("Enter radius: ");
        double radiusCircle = scanner.nextDouble();

        System.out.println("Circle Perimeter = " + circle.calculatePerimeter(radiusCircle));
        System.out.println("Circle Area = " + circle.calculateArea(radiusCircle));

    }

}
