package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

public class TwoNumberMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();

        if(numberOne > numberTwo) System.out.println("The bigest is 1");
        else if (numberTwo > numberOne) System.out.println("The bigest is 2");
        else System.out.println("Равны");

        System.out.println(Math.max(numberOne, numberTwo));
    }
}
