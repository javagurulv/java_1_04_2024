package lv.javaguru.java1.student_anton_pereloma.lesson_4.lessoncode;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Grade");
        int grade = scanner.nextInt();

        if ((grade >= 90) && (grade <= 100)) {
            System.out.println("A");
        } else if ((grade >= 80) && (grade <= 89)) {
            System.out.println("B");
        } else if ((grade >= 70) && (grade <= 79)) {
            System.out.println("C");
        } else if ((grade >= 60) && (grade <= 69)) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }

}
