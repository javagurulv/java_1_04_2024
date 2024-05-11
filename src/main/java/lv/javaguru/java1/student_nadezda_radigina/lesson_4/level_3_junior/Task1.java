package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_3_junior;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();

        if ((number1 > number2) && (number1 > number3)){
            System.out.println(number1);
        } else if (number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
    }
    }

}

