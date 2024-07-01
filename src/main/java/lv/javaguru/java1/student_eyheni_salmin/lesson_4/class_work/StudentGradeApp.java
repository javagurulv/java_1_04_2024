package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

class StudentGradeApp {
    public static void main(String[] args) {
        int mark = new Scanner(System.in).nextInt();

        StudentGrade sg = new StudentGrade();
        System.out.println(sg.calculateGrade(mark));

    }
}
