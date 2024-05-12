package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

class EqualsNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1 ");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2 ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers Equals");
        } else if (number1 != number2){ // mozem prosto ispolzovatj else
            System.out.println("Numbers different");
        }
    }
}
