package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

class Square extends Shape {

    private double side;

    Square(double side, String title){
        super(title);
        this.side = side;
    }

    double calculateArea(){
        return side * side;
    }

    double calculatePerimeter(){
        return side * 4;
    }

}
