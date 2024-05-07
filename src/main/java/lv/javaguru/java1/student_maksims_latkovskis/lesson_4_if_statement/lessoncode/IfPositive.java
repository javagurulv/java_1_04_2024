package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IfPositive {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer:");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("Number is positive");
        }

    }
}
