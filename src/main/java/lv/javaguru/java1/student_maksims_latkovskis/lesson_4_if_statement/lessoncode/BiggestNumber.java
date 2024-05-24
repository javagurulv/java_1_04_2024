package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;


public class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int number1 = scanner.nextInt();

        System.out.println("Input second number:");
        int number2 = scanner.nextInt();

        if(number1>number2){
            System.out.println("Biggest number is: " + number1);
        }
        else if(number2>number1){
            System.out.println("Biggest number is: " + number2);
        }
        else{
            System.out.println("Numbers are equal");
        }

    }
}
