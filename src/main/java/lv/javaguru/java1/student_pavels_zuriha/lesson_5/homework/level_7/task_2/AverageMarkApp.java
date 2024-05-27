package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AverageMark averageMark = new AverageMark();

        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        String[] students = averageMark.studentsNamesArray(studentCount);

        double[] grades = averageMark.studentsGrades(students, studentCount);

        double sum = averageMark.studentsSumGrades(grades);

        double average = averageMark.studentsAverageGrade(sum, studentCount);

        averageMark.studentsGradeAboveAverage(studentCount,grades, average, students);

        System.out.println("Программа завершена.");
    }
}
