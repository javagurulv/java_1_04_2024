package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечание: обратите внимание, что результат может быть дробным числом.
 */

public class CalculatingAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number :");
        int firstNumber = scanner.nextInt();

        System.out.println("Input second number :");
        int secondNumber = scanner.nextInt();

        System.out.println("Input third number :");
        int thirdNumber = scanner.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        double average = (double) total / 3;

        String message = "Average value is " + average;

        System.out.println(message);

    }
}
