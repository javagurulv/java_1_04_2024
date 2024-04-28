package lv.javaguru.java1.student_pavels_zuriha.lesson_2.lessoncode;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        double discr = (double) b*b - 4*a*c;

        double firstX = (-b + Math.sqrt(discr)) / (double) (2 * a);
        double secondX = (-b - Math.sqrt(discr)) / (double) (2 * a);

        System.out.println("x1 = " + firstX);
        System.out.println("x2 = " + secondX);

    }
}
