package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_3_junior;

import java.util.Scanner;

class MinMaxMinNumber {
    public static void main(String[] args) {

        MinMaxMinNumber maxMinNumber = new MinMaxMinNumber();
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int num3 = new Scanner(System.in).nextInt();
        System.out.println(maxMinNumber.getMaxNumber(num1, num2, num3));

    }
    public String getMaxNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 >num3) return "Больше первое число";
        if (num1 < num2 && num2 >num3) return "Больше второе число";
        if (num3 > num1 && num2 <num3) return "Больше третье число";
        else return "Хрень";
    }
}
