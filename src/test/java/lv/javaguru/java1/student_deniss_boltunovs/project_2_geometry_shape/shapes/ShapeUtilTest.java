package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

       ShapeUtil util = new ShapeUtil();

       @Test
       void totalShapesArea(){
           Shape[] shapes = {
                   new Circle("Circle", 4.0),
                   new Square("Square", 3.0),
                   new Rectangle("Rectangle", 2.0, 3.0) };

           double result = util.calculateArea(shapes);
           assertEquals( 65.26548245743669, result);
       }

        @Test
        void totalShapesPerimeter(){
            Shape[] shapes = {
                    new Circle("Circle", 4.0),
                    new Square("Square", 3.0),
                    new Rectangle("Rectangle", 2.0, 3.0) };

            double result = util.calculatePerimeter(shapes);
            assertEquals( 47.132741228718345, result);
        }

}