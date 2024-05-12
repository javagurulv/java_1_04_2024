package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class PositiveNegativeEqual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:") ;
        int number = scanner.nextInt();
        
        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;

        String message ;

        if (isPositive) {
            message = "This is positive number " + number;
        } else if (isNegative) {
            message = "This is negative number " + number;
        } else {
            message = "Number equals to " + number ;
        }

        System.out.println(message);

    }
}
