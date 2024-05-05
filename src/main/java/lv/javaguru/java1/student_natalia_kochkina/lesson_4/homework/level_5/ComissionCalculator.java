package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_5;

import java.util.Scanner;

class ComissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to withdraw?");
        int withdrawnMoney = scanner.nextInt();
        double comission = 0.0;

        if (withdrawnMoney < 1000) {
            comission = withdrawnMoney * 0.03;
        }
        if ((withdrawnMoney >= 1000) && (withdrawnMoney < 5000)) {
            comission = withdrawnMoney * 0.04;
        }
        if (withdrawnMoney >= 5000) {
            comission = withdrawnMoney * 0.05;
        }

        System.out.println("comission = " + comission);
    }
}
