package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class ThreeNumbers {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
         boolean isNegative = number < 0;
         boolean isZero = number == 0;
         boolean isPositive = number > 0;

         System.out.println("Number is negative = " + isNegative);
         System.out.println("Number is zero = " + isZero);
         System.out.println("Number is positive = " + isPositive);

     }
}
