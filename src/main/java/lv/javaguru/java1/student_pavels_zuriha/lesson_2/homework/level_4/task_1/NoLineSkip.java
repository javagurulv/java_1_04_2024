package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_4.task_1;

import java.util.Scanner;

class NoLineSkip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any words: ");
        String anyWords = scanner.nextLine();

        System.out.print("No line skip: ");
        System.out.print(anyWords);

    }
}
