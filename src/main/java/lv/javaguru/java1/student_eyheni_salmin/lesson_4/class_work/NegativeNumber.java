package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

class NegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        boolean isNegative = number < 0;

        System.out.println("Number is negative = " + isNegative);
    }
}
