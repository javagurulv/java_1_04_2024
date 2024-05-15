package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_6;

import java.util.Scanner;

class ReportCard {
    String name;
    String surname;
    int math;
    int biology;
    int geography;
    int physicalEducation;
    int physics;

    ReportCard(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    void setMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Math: ");
        this.math = scanner.nextInt();
        System.out.println("Biology: ");
        this.biology = scanner.nextInt();
        System.out.println("Geography: ");
        this.geography = scanner.nextInt();
        System.out.println("Physical Education: ");
        this.physicalEducation = scanner.nextInt();
        System.out.println("Physics: ");
        this.physics = scanner.nextInt();
    }

    double getFinalAverageMark(ReportCard student) {
        return (student.math + student.biology + student.geography + student.physicalEducation + student.physics) / 5;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Student: '" + name +
                " "+ surname + '\'' +
                ", math: " + math +
                ", biology: " + biology +
                ", geography: " + geography +
                ", physicalEducation: " + physicalEducation +
                ", physics: " + physics +
                '}';
    }
}
