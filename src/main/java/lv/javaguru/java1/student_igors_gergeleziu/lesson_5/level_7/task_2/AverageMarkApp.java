package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = getStudentCount(scanner);
        String[] students = getStudentNames(scanner, studentCount);
        double[] grades = getStudentGrades(scanner, studentCount, students);
        double average = calculateAverageStudentGrade(studentCount, grades);
        System.out.println("Average grade: " + average);
        findStudentsWithGradeAboveAverage(studentCount, grades, students, average);
        System.out.println("The program is completed.");
    }

    private static int getStudentCount(Scanner scanner) {
        System.out.print("Enter students count: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void findStudentsWithGradeAboveAverage(int studentCount, double[] grades, String[] students, double average) {
        System.out.println("Students with grade above average:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private static double calculateAverageStudentGrade(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;
    }

    private static double[] getStudentGrades(Scanner scanner, int studentCount, String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Grade for student " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static String[] getStudentNames(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }
}
