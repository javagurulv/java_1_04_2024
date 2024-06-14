package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

import java.util.Scanner;

public class VarSqrt {

    public static void main(String[] args) {
        printVarSqrt();
    }
    public static double getVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        return scanner.nextInt();
    }


    public static double getVarX1(double b, double d, double a) {
        return (-b + Math.sqrt(d)) / (2 * a);
    }
    public static double getVarX2(double b, double d, double a) {
        return (-b - Math.sqrt(d)) / (2 * a);
    }


    public static void printVarSqrt() {

        double a = getVariable();
        double b = getVariable();
        double c = getVariable();
        double d = b * b - 4 * a * c;

        double x1 = getVarX1(b, d, a);
        double x2 = getVarX2(b, d, a);

        System.out.println("X1 = " + x1);
        System.out.println("X1 = " + x2);

    }

}

