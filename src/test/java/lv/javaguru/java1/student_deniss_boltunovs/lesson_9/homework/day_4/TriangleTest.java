package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle(5, 4,7,"Test Triangle");

    @Test
    void testTriangleArea(){
        double result = triangle.calculateArea();
        assertEquals(9.79, result, 0.01);
    }

    @Test
    void testTrianglePerimeter(){
        double result = triangle.calculatePerimeter();
        assertEquals(16, result);
    }

}