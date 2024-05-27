package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_4_junior;

class CircleCalculator {

    double radius;

    CircleCalculator(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius() {
        this.radius = 8;
    }

}
