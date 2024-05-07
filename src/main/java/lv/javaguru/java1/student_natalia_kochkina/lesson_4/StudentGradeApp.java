package lv.javaguru.java1.student_natalia_kochkina.lesson_4;


import java.util.Scanner;

class StudentGradeApp {

    public static void main(String[] args) {
        // User Interface (UI), Frontend
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        // Business logic / Backend
        StudentGrade studentGrade = new StudentGrade();
        String grade = studentGrade.calculateGrade(mark);

        // User Interface (UI), Frontend
        System.out.println(grade);
    }
}
