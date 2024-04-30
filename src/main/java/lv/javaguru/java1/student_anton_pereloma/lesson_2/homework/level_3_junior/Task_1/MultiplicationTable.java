package lv.javaguru.java1.student_anton_pereloma.lesson_2.homework.level_3_junior.Task_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int number = scanner.nextInt();
    for (int i = 1; i < 10; i++) {
        int product = number * i;
        System.out.println(number + " x " + i + " = " + product);
        }
    }
}