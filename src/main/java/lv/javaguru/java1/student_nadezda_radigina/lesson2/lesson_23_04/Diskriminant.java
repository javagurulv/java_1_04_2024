package lv.javaguru.java1.student_nadezda_radigina.lesson2.lesson_23_04;

import java.util.Scanner;

public class Diskriminant {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a: ");
    int a = scanner. nextInt();
        System.out.println("Enter b: ");
    int b = scanner. nextInt();
        System.out.println("Enter c: ");
    int c = scanner. nextInt();
    double d = b * b - 4 * a * c;

    // double x1 = (-b + Math.sqrt(d))  / (2 * a);
      //  double x2 = (-b + Math.sqrt(d))  / (2 * a);
     //  System.out.println("X1 = " + x1);
      //  System.out.println("X2 = " + x1);

        double root = Math.sqrt(d);
        System.out.println("Root of quadratic equation = " + ((-b + root) / (2 * a)));
        System.out.println("Root of quadratic equation = " + ((b + root) / ( 2 * a)));


}
}

