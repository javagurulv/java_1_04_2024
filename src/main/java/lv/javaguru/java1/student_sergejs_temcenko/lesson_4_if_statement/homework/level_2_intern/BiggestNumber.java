package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 Biggest: " + number1);
        } else if (number1 < number2) {
            System.out.println("Number 2 Biggest: " + number2);
        } else {
            System.out.println("Number 1 = Number 2: " + number1 + " = " + number2);
        }
    }
}
