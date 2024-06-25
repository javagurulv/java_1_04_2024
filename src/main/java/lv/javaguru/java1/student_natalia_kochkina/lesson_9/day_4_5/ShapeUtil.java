package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("RandomCircle", random.nextDouble(10));
    }

    Square createRandomSquare() {
        return new Square("RandomSquare", random.nextDouble(10));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("RandomRectangle",
                random.nextDouble(10), random.nextDouble(10));
    }

    Triangle createRandomTriangle() {
        return new Triangle("RandomTriangle", random.nextDouble(10));
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
