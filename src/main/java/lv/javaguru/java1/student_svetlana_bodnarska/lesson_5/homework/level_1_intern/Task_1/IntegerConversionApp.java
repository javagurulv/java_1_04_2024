package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_1_intern.Task_1;

import java.util.Scanner;

class IntegerConversionApp
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        IntegerConversion integerConversion = new IntegerConversion();
        String result = integerConversion.dividingNumbers(number);
        System.out.println("Result " + result);
    }
}
