package lv.javaguru.java1.student_pavels_zuriha.lesson_2.homework.level_2.task_2;

import java.util.Scanner;

public class NameOfTheUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);

    }
}
