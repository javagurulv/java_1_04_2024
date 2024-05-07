package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class InterestRates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter client credit rating");
        int creditRating = scanner.nextInt();

        int interestRate;

        if (creditRating > 700) {
           interestRate = 5;
        } else if ( creditRating >= 650) {
           interestRate = 7;
        } else {
           interestRate = 10;
        }

        System.out.println("Applicable interest rate = " + interestRate + "%");

    }
}
