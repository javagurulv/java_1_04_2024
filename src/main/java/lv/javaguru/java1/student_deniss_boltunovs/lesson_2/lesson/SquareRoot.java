package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.lesson;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        // creating object scanner for input from console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        // formula to find discriminant d = b^2-4ac
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double rootOne = ( -b + Math.sqrt(discriminant) ) / 2 * a;
        double rootTwo = ( -b - Math.sqrt(discriminant) ) / 2 * a;

        // formula to find roots x = ( -b +- sqr(b^2 -4ac) ) / 2a
        if (discriminant > 0) {
            System.out.println("Discriminant > 0" + "\n" + "Root one is : " + rootOne + "\n" + "Root two is : " +rootTwo);
        } else if (discriminant == 0) {
            System.out.println("Discriminant = 0" + "\n" + "Only one root : " + rootOne );
        } else {
            System.out.println("Discriminant < 0" + "\n" + "No roots applicable");
        }

    }
}
