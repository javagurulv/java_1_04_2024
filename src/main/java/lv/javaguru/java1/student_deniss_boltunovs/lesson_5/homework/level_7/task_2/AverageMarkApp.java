package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentCount = getStudentCount(scanner);
        String[] studentNames = getStudentName(studentCount, scanner);
        double[] studentGrades = getStudentGrades(studentCount,scanner, studentNames);
        double averageMark = calculateAverageGrade(studentCount,studentGrades);

        findStudentsWithGradeAboveAverage(studentCount, studentNames, studentGrades, averageMark);

        System.out.println("Program completed");

    }

    private static int getStudentCount(Scanner scanner) {
        System.out.print("Input students count: ");
        return Integer.parseInt(scanner.nextLine());
    }


    private static String[] getStudentName(int studentCount, Scanner scanner) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Input student name " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static double[] getStudentGrades(int studentCount, Scanner scanner, String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Input student mark " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static double calculateAverageGrade(int studentCount, double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / studentCount;
    }


    private static void findStudentsWithGradeAboveAverage(int studentCount, String[] students, double[] grades, double average) {
        System.out.println("Students with grade above average:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

}
