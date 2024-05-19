package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_5_middle;

import java.util.Scanner;
class ComissionFee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the withdraw amount:");

        double cashWithdraw = 0;
        while(cashWithdraw<=0) {
            cashWithdraw = scanner.nextDouble();
        }

        double comissionFee;
        if(cashWithdraw<1000){
            comissionFee = cashWithdraw*0.03;
        }
        else if(cashWithdraw<5000){
            comissionFee = cashWithdraw*0.04;
        }
        else {
            comissionFee = cashWithdraw*0.05;
        }

        System.out.println("Your comission fee is:" + comissionFee);
    }
}
