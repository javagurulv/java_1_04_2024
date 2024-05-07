package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class StudentGradeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score 0-100:");
        int mark = scanner.nextInt();

        while ((mark < 0) || (mark > 100)) {
            System.out.println("Enter real score you cheater:");
            mark = scanner.nextInt();
        }

        StudentGrade studentGrade = new StudentGrade();

        System.out.println("Your mark is: " + studentGrade.calculatedMark(mark));
    }
}
