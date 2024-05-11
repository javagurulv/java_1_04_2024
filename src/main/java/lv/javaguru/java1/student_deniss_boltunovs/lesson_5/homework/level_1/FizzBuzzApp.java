package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_1;

import java.util.Scanner;

class FizzBuzzApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number:");
        int number = scanner.nextInt();

        FizzBuzz myFizzBuzz = new FizzBuzz();

       System.out.println(myFizzBuzz.calculateFizzBuzz(number));

    }
}
