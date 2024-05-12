package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your yearly income");
        int income = scanner.nextInt();

        int taxRate;
        String message;

        if (income > 20000) {
            taxRate = 20;
            message = "Income above 20 000 - tax rate 20%";
        } else if ( (income >= 10000) && (income < 20000)) {
            taxRate = 15;
            message = "Income between 10 000 and 20 000 - tax rate 15%";
        } else {
            taxRate = 10;
            message = "Income till 10 000 - tax rate 10%";
        }

        double taxAmount = (double) (income * taxRate / 100) ;
        double netIncome = income - taxAmount;

        System.out.println(message);
        System.out.println("Tax amount = " + taxAmount);
        System.out.println("Net income = " + netIncome);

    }
}
