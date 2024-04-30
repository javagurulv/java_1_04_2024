package lv.javaguru.java1.student_pavels_zuriha.lesson_2.lessoncode;

import java.util.Scanner;

public class TriangleSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter height: ");
        double number2 = scanner.nextDouble();

        double square =  number1 * number2 / 2;

        System.out.println("Square of Triangle = " + square);
    }
}
