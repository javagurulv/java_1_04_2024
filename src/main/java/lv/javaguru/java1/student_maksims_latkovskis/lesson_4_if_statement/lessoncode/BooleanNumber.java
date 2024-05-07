package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class BooleanNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isNegative = (number < 0);
        boolean isPositive = (number > 0);
        boolean isZero = (number == 0);

        System.out.println("Number is negative: " + isNegative);
        System.out.println("Number is positive: " + isPositive);
        System.out.println("Number is zero: " + isZero);
    }
}
