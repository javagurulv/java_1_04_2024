package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_3;

import java.util.Scanner;
import java.util.ArrayList;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        // Request input numbers
        System.out.println("Enter number 1");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int number2 = scanner.nextInt();

        System.out.println("Enter number 3");
        int number3 = scanner.nextInt();

        // Add numbers to numberList (ArrayList)
        numbersList.add(number1);
        numbersList.add(number2);
        numbersList.add(number3);

        int maxNumber = numbersList.get(0);
        // Iterate over numberList elements and determine Max number
        for (int i = 0 ; i < numbersList.size(); i++) {
            if (numbersList.get(i) > maxNumber) {
                maxNumber = numbersList.get(i);
            }
        }

        // Printing Max number to console
        System.out.println("Max number: " + maxNumber);

    }
}
