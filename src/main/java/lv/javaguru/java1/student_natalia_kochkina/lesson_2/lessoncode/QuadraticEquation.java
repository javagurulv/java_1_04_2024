package lv.javaguru.java1.student_natalia_kochkina.lesson_2.lessoncode;

import java.util.Scanner;

class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextInt();
        System.out.println("Enter b: ");
        double b = scanner.nextInt();
        System.out.println("Enter c: ");
        double c = scanner.nextInt();

        double d = (b * b) - (4 * a * c);
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);




    }
}
