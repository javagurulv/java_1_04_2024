package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_5_middle;

import java.util.Scanner;

public class CommissionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Withdrawal amount: ");
        CommissionCalculator newTransfer = new CommissionCalculator(scanner.nextInt());
        System.out.print("Commission fee: ");
        System.out.println(newTransfer.getPercentage() * 100 + "%");
    }
}
