package lv.javaguru.java1.student_natalia_kochkina.lesson_2.homework.level_3;

import java.util.Scanner;

public class CircleRadius {

    //Task_2
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
