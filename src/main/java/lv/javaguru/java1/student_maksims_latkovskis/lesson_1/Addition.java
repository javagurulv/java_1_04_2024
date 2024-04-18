package lv.javaguru.java1.student_maksims_latkovskis.lesson_1;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Enables input from terminal

        // Introducing first variable
        System.out.println("Enter first number to Add");
        int FirstVal =scanner.nextInt();

        // Introducing second variable
        System.out.println("Enter second number to Add");
        int SecondVal =scanner.nextInt();

        // Performing summation and printing result
        int SumVal=FirstVal+SecondVal;
        System.out.println("Your result is " + SumVal);
    }
}
