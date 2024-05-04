package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class OddEvenApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input whole number");
        int number = scanner.nextInt();

        String message = "";

        if (number % 2 == 0) {
            message = number + " - this is even number";
        } else {
            message = number + " - this is odd number";
        }

        System.out.println(message);

    }

}
