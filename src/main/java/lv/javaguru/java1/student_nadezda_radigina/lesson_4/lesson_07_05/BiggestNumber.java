package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2){
            System.out.println("Biggest number is 1! ");
        }
        if (number2 > number1){
            System.out.println("Biggest number is 2! ");
        }
        if (number1 == number2){
            System.out.println("Numbers are equals!");
        }
    }
}