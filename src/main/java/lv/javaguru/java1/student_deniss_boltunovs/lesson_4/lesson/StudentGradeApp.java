package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

import java.util.Scanner;

class StudentGradeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number between 1 and 100");
        int number = scanner.nextInt();

        StudentGrade student = new StudentGrade();
        String studentGrade = student.calculateGrade(number);

        System.out.println("Your grade: " + studentGrade);
    }

}
