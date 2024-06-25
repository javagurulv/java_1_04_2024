package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_5;

abstract class Shape {

    private String title;

    Shape(String title){
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
