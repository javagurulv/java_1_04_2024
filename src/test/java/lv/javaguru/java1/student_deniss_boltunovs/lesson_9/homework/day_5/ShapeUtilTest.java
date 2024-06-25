package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    ShapeUtil util = new ShapeUtil();
    Shape[] testData = ShapeUtilTestData.generateShapes();

    @Test
    void testShapesTotalArea(){
        double result = util.calculateArea(testData);
        assertEquals( 89.19, result, 0.01);
    }

    @Test
    void testShapesTotalPerimeter(){
        double result = util.calculatePerimeter(testData);
        assertEquals( 69.13, result, 0.01);
    }

}