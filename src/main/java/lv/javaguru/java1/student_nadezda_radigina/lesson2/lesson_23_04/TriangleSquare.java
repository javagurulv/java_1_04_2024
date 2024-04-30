package lv.javaguru.java1.student_nadezda_radigina.lesson2.lesson_23_04;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a: ");
    int a = scanner. nextInt();
        System.out.println("Enter b: ");
    int b = scanner. nextInt();
        System.out.println("Enter c: ");
    int c = scanner. nextInt();
    double p =(a + b + c) / (double) 2;
        System.out.println(p);

        double square = Math.sqrt(p * (p - a) * (p -b) * (p - c));
        System.out.println("Triangle Square = " + square);

}
}

