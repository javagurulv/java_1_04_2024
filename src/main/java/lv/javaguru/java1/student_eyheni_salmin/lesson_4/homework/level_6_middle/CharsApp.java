package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class CharsApp {
    public static void main(String[] args) {
        int romeNum = new Scanner(System.in).nextInt();
        Chars chars = new Chars();
        chars.getRomeNum(romeNum);
        chars.print();

    }
}
