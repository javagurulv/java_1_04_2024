package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB, String title){
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea(){
        return sideA * sideB;
    }

    double calculatePerimeter(){
        return (sideA + sideB) * 2;
    }

}
