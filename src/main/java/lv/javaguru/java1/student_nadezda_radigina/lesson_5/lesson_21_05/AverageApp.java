package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_21_05;

import java.util.Scanner;

public class AverageApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Average average = new Average();
        double averageResult = average.findAverage(4, 6);

        System.out.println("Is average = " + averageResult);
    }
}
