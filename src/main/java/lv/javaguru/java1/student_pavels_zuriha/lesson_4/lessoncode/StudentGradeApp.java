package lv.javaguru.java1.student_pavels_zuriha.lesson_4.lessoncode;

import java.util.Scanner;

class StudentGradeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark: ");
        int mark = scanner.nextInt();

        StudentGrade studentGrade = new StudentGrade();
        String grade = studentGrade.calculateGrade(mark);

        System.out.println(grade);


    }
}
