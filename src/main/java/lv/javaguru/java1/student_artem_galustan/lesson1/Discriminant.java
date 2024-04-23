package lv.javaguru.java1.student_artem_galustan.lesson1;

import java.util.Scanner;
public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        double d = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

    }

}
