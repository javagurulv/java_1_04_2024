package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;

import java.util.Scanner;

class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The maximum number is: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The maximum number is: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The maximum number is: " + number3);
        } else if (number1 == number2 && number1 > number3) {
            System.out.println("The maximum number is: " + number1);
        } else if (number1 == number3 && number1 > number2) {
            System.out.println("The maximum number is: " + number1);
        } else if (number2 == number3  && number2 > number1) {
            System.out.println("The maximum number is: " + number2);
        }

    }
}
