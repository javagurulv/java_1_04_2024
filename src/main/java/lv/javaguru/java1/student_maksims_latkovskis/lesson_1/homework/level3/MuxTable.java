package lv.javaguru.java1.student_maksims_latkovskis.lesson_1.homework.level3;

import java.util.Scanner;

public class MuxTable {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Initialising scanner

        System.out.println("Please enter integer from 1 to 10:");
        //Scanning value
        int InputNumber = scanner.nextInt();

        //Checking if the value is of the valid range
        while((InputNumber<0)||(InputNumber>11)){
            System.out.println("Please enter valid integer from 1 to 10:");
            InputNumber = scanner.nextInt();
        }

        int MuxNumber; //Defining multiplication result
        for( int i=1; i<11; i++){
            MuxNumber = InputNumber*i;
            System.out.println( InputNumber + " x " + i + " = " + MuxNumber);
        }


    }

}
