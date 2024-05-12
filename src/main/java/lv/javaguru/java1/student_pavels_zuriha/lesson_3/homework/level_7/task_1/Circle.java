package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_7.task_1;

import java.util.Scanner;

class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }

    public double calculateRadius() {
        return Math.PI * radius * radius;

    }

}
