package lv.javaguru.java1.student_maksims_latkovskis.lesson_2;

import java.util.Scanner;
import java.lang.Math;

public class RootFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first polynomial coefficient");
        int c = scanner.nextInt();
        System.out.println("Enter second polynomial coefficient");
        int b = scanner.nextInt();
        System.out.println("Enter third polynomial coefficient ");
        int a = scanner.nextInt();

        int Discr = b * b - 4 * a * c;

        if (Discr < 0) {
            System.out.println("No real roots");
            return;
        }
        else {
            double Root1 = (-b + Math.sqrt(Discr))/(2*a);
            double Root2 = (-b - Math.sqrt(Discr))/(2*a);
            System.out.println("Root 1 is: " + Root1);
            System.out.println("Root 2 is: " + Root2);
            return;
        }

    }

}
