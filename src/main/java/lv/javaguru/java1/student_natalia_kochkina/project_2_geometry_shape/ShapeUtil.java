package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import java.util.Random;

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

}
