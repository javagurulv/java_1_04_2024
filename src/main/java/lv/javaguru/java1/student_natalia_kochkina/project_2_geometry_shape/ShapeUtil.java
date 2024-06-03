package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        double radius = random.nextDouble(10);
        return new Circle("RandomCircle", radius);
    }

    Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("RandomSquare", side);
    }

    Rectangle createRandomRectangle() {
        double side1 = random.nextDouble(10);
        double side2 = random.nextDouble(10);
        return new Rectangle("RandomRectangle", side1, side2);
    }

    Shape createRandomShape() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape: shapes) {
            area = area + shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape: shapes) {
            perimeter = perimeter + shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
        return allShapes.stream().filter(x -> x.equals(shapeToCompare))
                .collect(Collectors.toList());

    }

}
