package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_7_senior;

import java.lang.Math.*;
class Circle {

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        double area = this.radius*this.radius*Math.PI;
        return area;
    }
}

class CircleDemo{
    public static void main(String[] args){

        Circle circle = new Circle(5);
        double areaOfTheCircle = circle.calculateArea();

        System.out.println("The are of this circle is: " + areaOfTheCircle);
    }
}
