package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_1;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double PI = Math.PI;
        double area = PI * Math.pow(this.radius, 2);

        return area;
    }

}
