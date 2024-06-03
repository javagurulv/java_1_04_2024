package lv.javaguru.java1.student_natalia_kochkina.lesson_4.lessoncode;

import java.util.Scanner;

class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = scanner.nextInt();
        double tax;

        if (income < 10000) {
            tax = income * 0.1;
        } else if ((income >= 10000) && (income < 20000)) {
            tax = income * 0.15;
        } else {
            tax = income * 0.2;
        }

        System.out.println("your tax = " + tax);
    }
}
