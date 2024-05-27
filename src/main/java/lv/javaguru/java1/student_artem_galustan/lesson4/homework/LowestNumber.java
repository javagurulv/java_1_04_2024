package lv.javaguru.java1.student_artem_galustan.lesson4.homework;

import java.util.Scanner;

public class LowestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int Number = scanner.nextInt();
        System.out.println("Enter number: ");
        int Number2 = scanner.nextInt();

        if(Number < Number2){
            System.out.println("Lowest Number is " + Number );


        }else if (Number > Number2){
            System.out.println("Lowest Number is  " + Number2);

        }

    }
}
