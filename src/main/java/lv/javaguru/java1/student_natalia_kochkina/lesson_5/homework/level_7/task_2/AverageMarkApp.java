package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = getStudentCount(scanner);
        String[] students = getStudentsArray(studentCount);
        students = getStudentName(scanner, studentCount, students);
        double[] grades = getStudentGrade(scanner, studentCount, students);
        double averageGrade = getAverageGrade(grades, studentCount);
        writeStudentsWithHighestGrade(averageGrade, studentCount, grades, students);


        System.out.println("Программа завершена.");
    }

    private static int getStudentCount(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String[] getStudentsArray(int studentCount) {
        return new String[studentCount];
    }

    private static String[] getStudentName(Scanner scanner, int studentCount, String[] students) {
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    private static double[] getStudentGrade(Scanner scanner, int studentCount, String[] students) {
        double[] grades = new double[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static double getAverageGrade(double[] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);
        return average;
    }

    private static void writeStudentsWithHighestGrade(double average, int studentCount,
                                                      double[] grades, String[] students) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }

    }

}
