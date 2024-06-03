package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_21_05;

import java.util.Scanner;

class CalculatorApp {
     public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();

         Calculator calculator = new Calculator();
         boolean evenNumber = calculator.isEven(number);
         boolean oddNumber = calculator.isOdd(number);

         System.out.println("Result = " + evenNumber);
         System.out.println("Result = " + oddNumber);

     }
}
