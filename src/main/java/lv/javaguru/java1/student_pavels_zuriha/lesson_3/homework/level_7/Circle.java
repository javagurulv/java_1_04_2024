package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_7;

import java.util.Scanner;

import static java.lang.Math.PI;

class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }

    public double calculateRadius() {
        return Math.PI * radius * radius;

    }

}

class CircleDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle radius = new Circle(7.5);

        System.out.println("Area is: " + radius.calculateRadius());

    }

}