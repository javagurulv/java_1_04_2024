package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_1;

import java.util.Scanner;

class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
