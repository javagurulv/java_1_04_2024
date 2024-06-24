package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle(5.7, "Test Circle");

    @Test
    void testCircleArea(){
        double result = circle.calculateArea();
        assertEquals(102.07, result,0.01);
    }

    @Test
    void testCirclePerimeter(){
        double result = circle.calculatePerimeter();
        assertEquals(35.81, result, 0.01);
    }

}