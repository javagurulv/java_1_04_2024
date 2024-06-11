package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square = new Square("First square", 2);

    @Test
    void firstSquareArea(){
        double result = square.calculateArea();
        assertEquals(4, result);
    }

    @Test
    void firstSquarePerimeter(){
        double result = square.calculatePerimeter();
        assertEquals(8, result);
    }

}