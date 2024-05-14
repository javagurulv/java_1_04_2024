package lv.javaguru.java1.student_natalia_kochkina.lesson_2.lessoncode;

import java.util.Scanner;

class TriangleSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        double p = (a + b + c) / (double) 2;

        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Square = " + square);

    }
}
