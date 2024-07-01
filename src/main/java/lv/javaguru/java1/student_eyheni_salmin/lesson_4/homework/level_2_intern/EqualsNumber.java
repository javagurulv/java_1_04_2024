package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class EqualsNumber {
    public static void main(String[] args) {

        EqualsNumber equalsNumber = new EqualsNumber();
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(equalsNumber.getNumber(num1, num2));

    }
    public String getNumber(int num1, int num2) {
        if (num1 != num2) return "Numbers are different";
        else return "Numbers are equals";
    }
}
