package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] students = getStudentsList(scanner);
        double[] grades = getStudentsGrades(scanner, students);
        printAverage(grades);
        printBestStudents(students, grades);
        exitProgram();
    }

    private static String[] getStudentsList(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }

        return students;
    }

    private static double[] getStudentsGrades(Scanner scanner, String[] students) {
        double[] grades = new double[students.length];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static void printAverage(double[] grades) {
        AverageMarkCalculator averageMarkCalculator = new AverageMarkCalculator();
        System.out.println("Средний балл: " + averageMarkCalculator.getAverage(grades));
    }

    private static void printBestStudents(String[] students, double[] grades) {
        System.out.println("Студенты со средним баллом выше среднего:");

        AverageMarkCalculator averageMarkCalculator = new AverageMarkCalculator();

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > averageMarkCalculator.getAverage(grades)) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private static void exitProgram() {
        System.out.println("Программа завершена.");
    }
}
