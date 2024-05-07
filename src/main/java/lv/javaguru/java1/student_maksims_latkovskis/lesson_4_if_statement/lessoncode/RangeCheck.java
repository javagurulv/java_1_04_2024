package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class RangeCheck {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number:");
        int number = scanner.nextInt();

        if((number>=1) && (number<=10)){
            System.out.println("Number is in the 1-10 range");
        }
        else {
            System.out.println("Number is out of the 1-10 range");
        }
    }

}
