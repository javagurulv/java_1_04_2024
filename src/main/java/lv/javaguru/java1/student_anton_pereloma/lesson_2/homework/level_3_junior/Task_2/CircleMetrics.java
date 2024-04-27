package lv.javaguru.java1.student_anton_pereloma.lesson_2.homework.level_3_junior.Task_2;

import java.util.Scanner;

public class CircleMetrics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println("What's the circle's radius boss?");

        double radius = scanner.nextDouble();
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
