package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_7;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }
}
