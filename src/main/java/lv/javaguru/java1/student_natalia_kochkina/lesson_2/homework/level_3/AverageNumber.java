package lv.javaguru.java1.student_natalia_kochkina.lesson_2.homework.level_3;

import java.util.Scanner;

class AverageNumber {

    //Task_3
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter number 3: ");
        int number3 = scanner.nextInt();

        double average = (number1 + number2 + number3) / ((double) 3);

        System.out.println("average = " + average);

    }
}
