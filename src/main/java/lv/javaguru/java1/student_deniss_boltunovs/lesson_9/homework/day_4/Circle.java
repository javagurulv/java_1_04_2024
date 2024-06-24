package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

class Circle extends Shape {

    private double radius;

    Circle(double radius, String title){
        super(title);
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}
