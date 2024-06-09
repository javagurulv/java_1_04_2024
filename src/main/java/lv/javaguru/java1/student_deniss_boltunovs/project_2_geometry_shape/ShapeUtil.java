package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape;

import lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes.Circle;
import lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes.Rectangle;
import lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes.Square;
import java.util.Random;

public class ShapeUtil {

    Random random = new Random();

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

}
