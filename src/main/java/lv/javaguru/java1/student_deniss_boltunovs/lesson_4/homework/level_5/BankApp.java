package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_5;

import java.util.Scanner;

class BankApp {

    public static void main(String[] args) {

       Bank bank = new Bank();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Your withdrawal amount?");
       int withdrawalAmount = scanner.nextInt();
       bank.commissionCalculate(withdrawalAmount);

       System.out.println("withdrawal amount: " + bank.getWithdrawAmount());
       System.out.println("commission rate: " + bank.getCommissionRate());
       System.out.println("commission amount: " + bank.getCommissionAmount());

    }

}
