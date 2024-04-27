package lv.javaguru.java1.student_maksims_latkovskis.lesson_1_introduction;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Enables input from terminal

        // Introducing first variable
        System.out.println("Enter the Division Numerator");
        int FirstVal =scanner.nextInt();

        // Introducing second variable
        System.out.println("Enter the Division Denominator");
        int SecondVal =scanner.nextInt();

        // Performing division and printing result
        int DivVal=FirstVal/SecondVal;
        System.out.println("Your result is " + DivVal);
    }

}
