package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;

        if (isPositive) {
            System.out.println("Number is positive");
        }

    }
}
