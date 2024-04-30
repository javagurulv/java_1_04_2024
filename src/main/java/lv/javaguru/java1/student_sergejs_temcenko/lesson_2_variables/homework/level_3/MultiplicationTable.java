package lv.javaguru.java1.student_sergejs_temcenko.lesson_2_variables.homework.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner newObject = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = newObject.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
