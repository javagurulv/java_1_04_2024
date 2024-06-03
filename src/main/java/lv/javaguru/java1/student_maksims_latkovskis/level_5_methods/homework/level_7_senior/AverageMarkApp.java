package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        Students stud = new Students();
        String[] students = stud.students(studentCount); // Creating Students Array

        double[] grades = stud.grades(students); // Assigning marks

        double averageMark = stud.averageGrade(grades); // Computing average mark
        System.out.println("Средний балл: " + averageMark);

        stud.bestStudents(students, grades, averageMark);
        System.out.println("Программа завершена.");
    }
}