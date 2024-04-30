package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_3.task_2;

import java.util.Scanner;

import static java.lang.Math.*;

public class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();


        double p = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Perimeter is: " + p);
        System.out.println("Area is: " + area);

    }

}
