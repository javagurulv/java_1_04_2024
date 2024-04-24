package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number : ");
        int inputNumber = scanner.nextInt();

        //  iteration over 1 to 10
        for (int i = 1; i <= 10; i++) {

            int result = inputNumber * i;
            String resultMessage = inputNumber + " x " + i + " = " + result;

            System.out.println(resultMessage);

        }

    }
}
