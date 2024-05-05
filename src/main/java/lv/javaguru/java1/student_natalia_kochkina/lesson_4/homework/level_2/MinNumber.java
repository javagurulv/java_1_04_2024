package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_2;

import java.util.Scanner;

class MinNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("min number is " + firstNumber);
        } else if (secondNumber < firstNumber) {
            System.out.println("min number is " + secondNumber);
        } else {
            System.out.println("equal numbers");
        }
    }
}
