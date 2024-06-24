package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(5, 7, "Test Rectangle");

    @Test
    void testRectangleArea(){
        double result = rectangle.calculateArea();
        assertEquals(35, result);
    }

    @Test
    void testRectanglePerimeter(){
        double result = rectangle.calculatePerimeter();
        assertEquals(24, result);
    }


}