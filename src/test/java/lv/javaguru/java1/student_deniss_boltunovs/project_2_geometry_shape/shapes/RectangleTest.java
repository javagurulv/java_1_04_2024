package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle("First rectangle", 5, 6);

    @Test
    void firstRectangleArea(){
        double result = rectangle.calculateArea();
        assertEquals(30, result);
    }

    @Test
    void firstRectanglePerimeter(){
        double result = rectangle.calculatePerimeter();
        assertEquals(22, result);
    }


}