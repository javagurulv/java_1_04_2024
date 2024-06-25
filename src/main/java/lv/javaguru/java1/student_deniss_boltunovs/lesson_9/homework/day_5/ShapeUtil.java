package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle(){
        Random random = new Random();
        double radius = random.nextInt(10);
        return new Circle(radius, "Random Circle");
    }

    Square createRandomSquare(){
        Random random = new Random();
        double side = random.nextInt(10);
        return new Square(side, "Random Square");
    }

    Rectangle createRandomRectangle(){
        Random random = new Random();
        double sideA = random.nextInt(5);
        double sideB = random.nextInt(4);
        return new Rectangle(sideA, sideB, "Random Rectangle");
    }


    /// creating Triangle with equal sides
    Triangle createRandomTriangle(){
        Random random = new Random();
        double side = random.nextInt(7);
        return new Triangle(side, side, side, "Random Triangle");
    }

    Shape createRandomShape(){
        Random random = new Random();
        int number = random.nextInt(4);

        if (number == 0){
           return createRandomCircle();
        } else if (number == 1){
            return createRandomSquare();
        } else if (number == 2){
            return createRandomRectangle();
        } else{
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes){
        double totalArea = 0;
        for (Shape shape:shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes){
        double totalPerimeter = 0;
        for (Shape shape:shapes){
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    //// method helper
    double calculateArea(Shape shape){
        return shape.calculateArea();
    }

    //// method helper
    double calculatePerimeter(Shape shape){
        return shape.calculatePerimeter();
    }


}
