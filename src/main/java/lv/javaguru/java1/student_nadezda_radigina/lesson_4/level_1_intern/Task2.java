package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_1_intern;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scanner.nextInt();

        if ((number % 2) == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
