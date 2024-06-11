package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle("First circle", 5.6);

    @Test
    void firstCircleArea(){
        double result = circle.calculateArea();
        assertEquals( 98.5203456165759, result);
    }

    @Test
    void firstCirclePerimeter(){
        double result = circle.calculatePerimeter();
        assertEquals( 35.18583772020568, result);
    }

}