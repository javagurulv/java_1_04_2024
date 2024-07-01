package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class EvenNum {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        EvenNum evenNum = new EvenNum();
        System.out.println(evenNum.getEvenNum(num));
    }

    public String getEvenNum(int num) {
        if (num % 2 == 0) return "Четное";
        else return "НеЧетное";
    }
}
