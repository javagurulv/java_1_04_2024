package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AverageMark averageMark = new AverageMark();
        int studentCount = averageMark.getStudentsCount(scanner);
        String[] students = averageMark.getStudents(scanner,studentCount);
        double[] grades = averageMark.getGrades(scanner, studentCount, students);
        double average = averageMark.getAverage(studentCount, grades);
        averageMark.printStudentsWithHighestGrades(studentCount, students, grades, average);
    }

}
