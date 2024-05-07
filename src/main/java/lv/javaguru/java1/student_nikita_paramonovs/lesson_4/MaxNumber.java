package lv.javaguru.java1.student_nikita_paramonovs.lesson_4;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("biggest number is 1!");
        }

        if (number2 > number1){
            System.out.println("biggest number is 2!");
        }

        if (number1 == number2){
            System.out.println("number are equals!");
        }
    }
}
