package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class StudentGradeOld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number between 1 and 100");
        int number = scanner.nextInt();

        char grade;

        if ((number >= 90) && (number <= 100)) {
           grade = 'A' ;
        } else if ((number >= 80) && (number <= 89)) {
           grade = 'B';
        } else if ((number >= 70) && (number <= 79)) {
           grade = 'C';
        } else if ((number >= 60) && (number <= 69)) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

    }
}
