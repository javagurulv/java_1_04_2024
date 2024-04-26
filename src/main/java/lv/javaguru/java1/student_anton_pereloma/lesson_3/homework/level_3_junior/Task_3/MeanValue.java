package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_3_junior.Task_3;

import java.util.Scanner;

public class MeanValue {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the first number boss?");
        double firstNumber = scanner.nextInt();
        System.out.println("What's the second number boss?");
        double secondNumber = scanner.nextInt();
        System.out.println("What's the third number boss?");
        double thirdNumber = scanner.nextInt();

        double mean = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Here's the mean value, boss: " + mean);

    }
}
