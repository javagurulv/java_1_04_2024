package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC, String title){
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double calculateArea(){
        double semiPerimeter = calculatePerimeter() / 2 ;
        double calculation = semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC);
        return Math.sqrt(calculation);
    }

    double calculatePerimeter(){
        return sideA + sideB + sideC;
    }

}
