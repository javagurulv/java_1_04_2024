package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double pi = 3.14159265358979323846264338327950288419716939937510;
        double p = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Perimeter is: " + p);
        System.out.println("Area is: " + area);

    }

}
