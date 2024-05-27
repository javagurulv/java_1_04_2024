package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMark {

    public String[] studentsNamesArray(int studentCount) {

        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    public double[] studentsGrades(String[] students, int studentCount) {

        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            Scanner scanner = new Scanner(System.in);
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    public double studentsSumGrades(double[] grades) {

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum;
    }

    public double studentsAverageGrade(double sum, int studentCount) {
        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);

        return average;
    }

    public void studentsGradeAboveAverage(int studentCount, double[] grades, double average, String[] students) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }

    }
}
