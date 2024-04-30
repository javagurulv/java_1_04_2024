package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_3.task_3;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println("Enter third number: ");
        int z = scanner.nextInt();

        double result = ((double) x * y * z) / 3;

        System.out.println("Average is: " + result);


    }
}
