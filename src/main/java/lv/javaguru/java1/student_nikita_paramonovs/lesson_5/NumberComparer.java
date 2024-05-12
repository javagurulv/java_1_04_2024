package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;

import java.util.Scanner;

class NumberComparer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 != number2) {
            System.out.println("Numbers are different.");
        } else {
            System.out.println("Numbers are equals.");
        }
    }
}
