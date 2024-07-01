package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class MinMaxNumber {
    public static void main(String[] args) {

        MinMaxNumber maxMinNumber = new MinMaxNumber();
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(maxMinNumber.getMaxNumber(num1, num2));

    }
    public String getMaxNumber(int num1, int num2) {
        if (num1 < num2) return "Меньше первое число";
        else return "Меньше второе число";
    }
}
