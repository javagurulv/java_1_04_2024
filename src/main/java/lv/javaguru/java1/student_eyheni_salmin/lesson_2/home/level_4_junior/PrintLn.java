package lv.javaguru.java1.student_eyheni_salmin.lesson_2.home.level_4_junior;

import java.util.Scanner;

public class PrintLn {
    public static void main(String[] args) {
        String string = new Scanner(System.in).next();
        getThisLine(string);
        getNextLine(string);
    }

    public static void getThisLine(String string) {
        System.out.print("Это строка выводится с помощью System.out.print() без переноса: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
    public static void getNextLine(String string) {
        System.out.print("Это строка выводится с помощью System.out.println() с переносом: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(string + " ");
        }
    }

}