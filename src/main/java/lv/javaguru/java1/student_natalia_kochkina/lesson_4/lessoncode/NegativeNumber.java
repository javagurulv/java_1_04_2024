package lv.javaguru.java1.student_natalia_kochkina.lesson_4.lessoncode;

import java.util.Scanner;

class NegativeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        System.out.println("Number is negative = " + isNegative);
    }
}
