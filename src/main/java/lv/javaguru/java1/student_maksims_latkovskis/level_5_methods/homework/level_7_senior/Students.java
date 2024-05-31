package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

import java.util.Scanner;

class Students {

    String[] students(int studentCount) {

        Scanner scanner = new Scanner(System.in);
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

    double[] grades(String[] students) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[students.length];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    double averageGrade(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        return average;

    }

    void bestStudents(String[] students, double[] grades, double average) {

        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

}
