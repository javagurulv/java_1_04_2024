package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class StudentMarkApp {

    public static void main(String[] args) {

        // User Interface (UI), Frontend
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        // Business logic, Backend

        StudentMark studentMark = new StudentMark();
        String grade = studentMark.calculateGrade(mark);

        System.out.println(grade);


        if ((mark >= 90) && (mark <= 100)){
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)){
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)){
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)){
            System.out.println("D");
        } else if ((mark >= 50) && (mark <= 59)){
            System.out.println("E");
        } else if ((mark >= 0) && (mark <= 49)){
            System.out.println("F");
        }
    }
}
