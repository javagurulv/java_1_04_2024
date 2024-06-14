package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Home.level_3_junior;

import java.util.Scanner;

public class АrithmeticМean {
    public static void main(String[] args) {
        int summ = 0;
        int quantity = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число: ");
            summ += new Scanner(System.in).nextInt();
            quantity += 1;
        }
        System.out.println(summ / (double) quantity);
    }
}
