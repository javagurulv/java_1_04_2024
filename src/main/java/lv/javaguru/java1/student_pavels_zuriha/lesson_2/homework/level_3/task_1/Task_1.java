package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_3.task_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        int i = 0;
        while(i <=10) {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        }
    }
}
