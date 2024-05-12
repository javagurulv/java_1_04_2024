package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_2_intern;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();

        if (number1 < number2){
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}

