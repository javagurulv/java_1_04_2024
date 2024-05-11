package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class LesserNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Number Two is Lesser");
        } else if (number1 < number2) {
            System.out.println("Number One is Lesser");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
