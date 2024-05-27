package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {
    public static void main(String[] args) {
        AverageMarkApp app = new AverageMarkApp();
        Scanner scanner = new Scanner(System.in);
        int studentCount = app.getStudentCount(scanner);
        String[] students = app.getStudentNames(scanner, studentCount);
        double[] grades = app.getStudentGrades(scanner, studentCount, students);
        double average = app.calculateAverageStudentGrade(studentCount, grades);
        System.out.println("Average grade: " + average);
        app.findStudentsWithGradeAboveAverage(studentCount, grades, students, average);
        System.out.println("The program is completed.");
    }

    private int getStudentCount(Scanner scanner) {
        System.out.print("Enter students count: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void findStudentsWithGradeAboveAverage(int studentCount, double[] grades, String[] students, double average) {
        System.out.println("Students with grade above average:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private double calculateAverageStudentGrade(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;
    }

    private double[] getStudentGrades(Scanner scanner, int studentCount, String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Grade for student " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private String[] getStudentNames(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }
}
