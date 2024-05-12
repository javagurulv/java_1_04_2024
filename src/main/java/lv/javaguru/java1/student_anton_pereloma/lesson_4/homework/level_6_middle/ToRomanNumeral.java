package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class ToRomanNumeral {
    String converter(int number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "provide a number within 1 to 10 range";
        };
    }
}
