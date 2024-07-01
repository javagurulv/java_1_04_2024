package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

class RangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) System.out.println("Number in range");
        else System.out.println("Is not");
    }
}
