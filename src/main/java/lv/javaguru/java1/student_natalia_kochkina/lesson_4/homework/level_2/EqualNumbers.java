package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_2;

import java.util.Scanner;

class EqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber != secondNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
