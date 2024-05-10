package lv.javaguru.java1.student_pavels_zuriha.lesson_5.lessoncode;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class SquareRoot {



    double discriminant(int a, int b, int c) {
        int discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }

    double firstSquare (int a, int b, int c) {
        double firstSquare = (-b + sqrt(discriminant(a,b,c))) / (2 *a);
        return firstSquare;
    }

    double secondSquare(int a, int b, int c ) {
        double secondSquare = (-b - sqrt(discriminant(a,b,c))) / (2 *a);
        return secondSquare;
    }
}

class SquareRootApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SquareRoot squareRoot = new SquareRoot();

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        System.out.println("Discriminant is: " + squareRoot.discriminant(a,b,c));

        double d = squareRoot.discriminant(a,b,c);

        if (d < 0) {
            System.out.println("Not possible");
        } else if (d == 0) {
            System.out.println("Only 1 root");
            double x = squareRoot.firstSquare(a,b,c);
            System.out.println("Root = " + x);
        } else {
            System.out.println("Two Roots");
            double x1 = squareRoot.firstSquare(a,b,c);
            double x2 = squareRoot.secondSquare(a,b,c);
            System.out.println("First root: " + x1);
            System.out.println("Second root: " + x2);
        }




    }
}
