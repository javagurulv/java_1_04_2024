package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive!");
            System.out.println("Number is positive!");
        }

        System.out.println("FINISH!");
    }

}
