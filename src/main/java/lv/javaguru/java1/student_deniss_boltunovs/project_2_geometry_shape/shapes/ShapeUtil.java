package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

import java.util.Random;

class ShapeUtil {

    private Random random = new Random();

    Circle createRandomCircle(){
        double radius = random.nextDouble(5);
        return new Circle("Circle", radius);
    }

    Square createRandomSquare(){
        double sideLength = random.nextDouble(5);
        return new Square("Square", sideLength);
    }

    Rectangle createRandomRectangle(){
        double length = random.nextDouble(5);
        double width = random.nextDouble(5);
        return new Rectangle("Rectangle",length, width);
    }

    Shape createRandomShape(){
        int randomNumber = random.nextInt(3);
        Shape shape = createRandomCircle();
        switch (randomNumber) {
            case 0 -> shape = createRandomCircle();
            case 1 -> shape = createRandomSquare();
            case 2 -> shape = createRandomRectangle();
        }
        return shape;
    }

}
