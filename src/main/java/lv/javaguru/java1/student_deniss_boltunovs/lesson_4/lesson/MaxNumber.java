package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number 1");
        int number1 = scanner.nextInt();

        System.out.println("Please enter number 2");
        int number2 = scanner.nextInt();

        int maxNumber = number1;

        if (number2 > number1) {
            maxNumber = number2;
        }

        System.out.println("Max number = " + maxNumber);

    }
}
