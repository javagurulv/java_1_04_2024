package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_2;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Please enter Number 1");
       int number1 = scanner.nextInt();

       System.out.println("Please enter Number 2");
       int number2 = scanner.nextInt();

       String message;

       if (number1 > number2) {
           message = "Max number: " + number1;
       } else if (number2 > number1) {
           message = "Max number: " + number2;
       } else {
           message = "Both numbers are equal";
       }

       System.out.println(message);

    }

}
