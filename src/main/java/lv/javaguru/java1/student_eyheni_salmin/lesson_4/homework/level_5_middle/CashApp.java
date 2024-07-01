package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_5_middle;

import java.util.Scanner;

class CashApp {
    public static void main(String[] args) {
        int getSumCash = new Scanner(System.in).nextInt();

        Cash cash = new Cash();
        cash.cashWithdrawal(getSumCash);
        cash.printCashWithdrawal();

    }
}
