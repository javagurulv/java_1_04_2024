package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;

import java.util.Scanner;

class SmallestNumberFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("minimum number is: " + number1);
        } else if (number2 < number1) {
            System.out.println("minimum number is: " + number2);
        }
    }
}
