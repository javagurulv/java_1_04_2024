package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;

import java.util.Scanner;

class GreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount in euros:");
        double withdrawalAmount = scanner.nextDouble();
        double commission;


        if (withdrawalAmount < 1000) {
            commission = withdrawalAmount * 0.03;
        } else if (withdrawalAmount >= 1000 && withdrawalAmount < 5000) {
            commission = withdrawalAmount * 0.04;
        } else {
            commission = withdrawalAmount * 0.05;
        }

        System.out.println("Commission amount: " + commission + " euros");

    }
}
