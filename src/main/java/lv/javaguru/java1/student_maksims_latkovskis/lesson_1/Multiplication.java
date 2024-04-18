package lv.javaguru.java1.student_maksims_latkovskis.lesson_1;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Enables input from terminal

        // Introducing first variable
        System.out.println("Enter first number to Multiply");
        int FirstVal =scanner.nextInt();

        // Introducing second variable
        System.out.println("Enter second number to Multiply");
        int SecondVal =scanner.nextInt();

        // Performing multiplication and printing result
        long MuxVal=FirstVal*SecondVal;
        System.out.println("Your result is " + MuxVal);
    }
}
