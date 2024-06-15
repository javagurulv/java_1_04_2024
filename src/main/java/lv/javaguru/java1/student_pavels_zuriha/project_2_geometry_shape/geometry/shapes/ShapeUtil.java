package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

import java.util.Random;

class ShapeUtil {

    private Random randomNumbers = new Random();

    public Circle createRandomCircle() {
        double radius = randomNumbers.nextDouble((6) + 1);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double length = randomNumbers.nextDouble((6) +1);
        return new Square("Square", length);
    }

    public Rectangle createRandomRectangle() {
        double length = randomNumbers.nextDouble((6) + 1);
        double width = randomNumbers.nextDouble((6) + 1);
        return new Rectangle("Rectangle", length, width);
    }

    public Shape createRandomShape() {

        double random = randomNumbers.nextInt(2);

        if (random == 0) {
            return createRandomCircle();
        } else if (random == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    double calculateArea(Shape[] shapes) {

        double areaSum = 0.0;
        for (Shape i : shapes) {
            areaSum = areaSum + i.calculateArea();
        }
        return areaSum;
    }

    double calculatePerimeter(Shape[] shapes) {

        double perimeterSum = 0.0;
        for (Shape i : shapes) {
            perimeterSum = perimeterSum + i.calculatePerimeter();
        }
        return perimeterSum;
    }

}
