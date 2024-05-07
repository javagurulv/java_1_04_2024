package lv.javaguru.java1.student_jelena_k.lesson2.homework.level_3_junior.task1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number :");
        int firstNumber = scanner.nextInt();

        System.out.println("second number :");
        int secondNumber = scanner.nextInt();

        System.out.println("third number :");
        int thirdNumber = scanner.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        double average = (double) total / 3;

        String message = "Average value is " + average;
        System.out.println(message);
    }
}
