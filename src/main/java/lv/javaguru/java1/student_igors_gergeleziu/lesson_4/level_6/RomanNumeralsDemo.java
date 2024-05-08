package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_6;

import java.util.Scanner;

class RomanNumeralsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RomanNumerals romanNumerals = new RomanNumerals();
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Your number " + number + " is " + romanNumerals.formatNumber(number));

    }
}
