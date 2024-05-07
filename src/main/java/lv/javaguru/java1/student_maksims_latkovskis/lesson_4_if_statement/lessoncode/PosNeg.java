package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number:");
        int number = scanner.nextInt();

        if(number<0) {
            System.out.println("Number is negative");
        }
         else if(number>0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero");
        }

    }


}
