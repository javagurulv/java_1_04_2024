package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_5_middle;

import java.util.Scanner;

class CardCommission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        double commission = 0;

        if(number < 1000){
            commission = number * 0.03;
        } else if (number >= 1000 && number < 5000){
            commission = number * 0.04;
        } else {
            commission =number * 0.05;
        }

        System.out.println("Commission = " + commission);
    }
}
