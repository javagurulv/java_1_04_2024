package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class PositiveNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:") ;
        int number = scanner.nextInt();

        boolean isPositive = number >= 0;
        boolean isNegative = number < 0;

        String message ;

        if (isPositive) {
            message = "This is positive number " + number;
        } else {
            message = "This is negative number " + number;
        }

        System.out.println(message);

    }
}
