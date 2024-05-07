package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class DiscountCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter purchase amount");
        int grossPurchase = scanner.nextInt();

        int discountRate;

        if (grossPurchase > 10000) {
            discountRate = 20;
        } else if (grossPurchase > 5000) {
            discountRate = 10;
        } else {
            discountRate = 0;
        }

        double discountAmount = (double) grossPurchase * discountRate / 100;
        double netPurchase = grossPurchase - discountAmount;

        System.out.println("Gross purchase = " + grossPurchase);
        System.out.println("Discount = " + discountRate + "%");
        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Net Purchase = " + netPurchase);

    }
}
