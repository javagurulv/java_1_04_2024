package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_1;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
