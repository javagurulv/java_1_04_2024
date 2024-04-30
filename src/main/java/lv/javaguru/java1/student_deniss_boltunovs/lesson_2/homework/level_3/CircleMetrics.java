package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

public class CircleMetrics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input circle radius: ");
        double radius = scanner.nextDouble();

        // PI = 3.14....
        // perimeter = 2 * PI * radius
        double PI = Math.PI;
        double perimeter = 2 * PI * radius;

        // area = PI * (radius ^ 2)
        double area = PI * Math.pow(radius,2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
