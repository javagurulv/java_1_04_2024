package lv.javaguru.java1.student_pavels_zuriha.lesson_2.lessoncode;

import java.util.Scanner;

class TriangleSquareGeron {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Side 1: ");
        int number1 = scanner.nextInt() ;

        System.out.println("Enter Side 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter Side 3: ");
        int number3 = scanner.nextInt();

        double p = (double) (number1 + number2 + number3) / 2;
        double square = Math.sqrt(p * (p-number1)*(p-number2)*(p-number3));

        System.out.println("Square of Triangle = " + square);


    }
}
