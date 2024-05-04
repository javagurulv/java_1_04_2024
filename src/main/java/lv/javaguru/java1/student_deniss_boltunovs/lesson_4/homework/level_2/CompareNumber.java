package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_2;

import java.util.Scanner;

public class CompareNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input Number 1");
        int number1 = scanner.nextInt();

        System.out.println("Please input Number 2");
        int number2 = scanner.nextInt();

        String message;

        if (number1 != number2) {
            message = "Numbers are different";
        } else {
            message = "Numbers are equals";
        }

        System.out.println(message);

    }
}
