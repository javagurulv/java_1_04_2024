package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = getStudentsCount(scanner);
        String[] students = getStudents(scanner, studentCount);
        double[] grades = getGrades(scanner, studentCount, students);
        double average = getAverage(studentCount, grades);
        printStudentsWithHighestGrades(studentCount, students, grades, average);
    }

    private static int getStudentsCount(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String[] getStudents(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static double[] getGrades(Scanner scanner, int studentCount,
                                      String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static double getAverage(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);
        return average;
    }

    private static void printStudentsWithHighestGrades(int studentCount, String[] students,
                                                       double[] grades, double average) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }

        System.out.println("Программа завершена.");
    }
}
