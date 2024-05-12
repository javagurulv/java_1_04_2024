package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class ToRomanNumeralApp {
    public static void main(String[] args) {
        ToRomanNumeral numeral = new ToRomanNumeral();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeral from 1 to 10 to convert to Roman Numeral: ");
        System.out.print("Roman Numeral: " + numeral.converter(scanner.nextInt()));
    }
}
