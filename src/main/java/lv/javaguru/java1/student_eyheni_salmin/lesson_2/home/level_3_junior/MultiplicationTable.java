package lv.javaguru.java1.student_eyheni_salmin.lesson_2.home.level_3_junior;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        getMultiplicationTable();
    }

    public static void getMultiplicationTable() {

        System.out.print("Напишите число:");

        int variable = new Scanner(System.in).nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(variable + " * " + i + " = " + variable * i);
        }
    }
}
