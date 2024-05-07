package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class Range {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("Number is within range 1-10") ;
        } else {
            System.out.println("Number is outside range");
        }

    }
}
