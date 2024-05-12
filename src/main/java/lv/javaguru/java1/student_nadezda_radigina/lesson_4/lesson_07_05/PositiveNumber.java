package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class PositiveNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Number is positive!");

        }
        System.out.println("Finish!");
    }
}
