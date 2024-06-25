package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
