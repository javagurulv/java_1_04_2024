package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMark {

    public int getStudentsCount(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String[] getStudents(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    public double[] getGrades(Scanner scanner, int studentCount,
                                      String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    public double getAverage(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / studentCount;
        System.out.println("Средний балл: " + average);
        return average;
    }

    public void printStudentsWithHighestGrades(int studentCount, String[] students,
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
