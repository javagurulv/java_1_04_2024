package lv.javaguru.java1.student_pavels_zuriha.lesson_4.lessoncode;

import java.util.Scanner;

class PositiveOrNegativeOrZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();

        boolean isNegative = x < 0;
        boolean isPositive = x > 0;
        boolean isZero = x == 0;

        System.out.println("Number is negative: " + isNegative);
        System.out.println("Number is positive: " + isPositive);
        System.out.println("Number is Zero: " + isZero);
    }
}
