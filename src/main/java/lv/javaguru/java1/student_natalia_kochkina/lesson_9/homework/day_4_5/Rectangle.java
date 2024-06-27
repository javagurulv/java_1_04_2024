package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_4_5;

class Rectangle extends Shape {

    private double side1;
    private double side2;

    public Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return side1 * side2;
    }

    @Override
    double calculatePerimeter() {
        return (side1 + side2) * 2;
    }

}
