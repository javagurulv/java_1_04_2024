package lv.javaguru.java1.student_nikita_paramonovs.lesson_2;

import java.util.Scanner;

//CODE_REVIEW: use big first letter in the class name, better: Homework
public class homework {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = scanner.nextInt();

        System.out.println("result" + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }



    }


}
