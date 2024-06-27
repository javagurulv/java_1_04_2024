package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_4_5;

class Triangle extends Shape {

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }

}
