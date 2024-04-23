package lv.javaguru.java1.student_nikita_paramonovs.lesson_2;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);



    }
}
