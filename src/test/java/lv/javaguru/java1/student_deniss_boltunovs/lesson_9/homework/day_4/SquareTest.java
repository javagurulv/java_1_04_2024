package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square = new Square(6, "Test Square");

    @Test
    void testSquareArea(){
        double result = square.calculateArea();
        assertEquals(36, result);
    }

    @Test
    void testSquarePerimeter(){
        double result = square.calculatePerimeter();
        assertEquals(24, result);
    }

}