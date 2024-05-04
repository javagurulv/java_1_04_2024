package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    double getRadius() {
        return this.radius;
    }

}
