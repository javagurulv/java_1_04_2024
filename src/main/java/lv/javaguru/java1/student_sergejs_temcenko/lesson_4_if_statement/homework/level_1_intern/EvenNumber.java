package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " not even number.");
        }
    }
}
