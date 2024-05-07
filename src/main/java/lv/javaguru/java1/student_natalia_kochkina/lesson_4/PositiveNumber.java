package lv.javaguru.java1.student_natalia_kochkina.lesson_4;

import java.util.Scanner;

class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        }
        System.out.println("Finish!");
    }
}
