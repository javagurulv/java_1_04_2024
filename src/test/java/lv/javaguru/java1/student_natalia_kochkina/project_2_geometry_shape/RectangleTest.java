package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle1", 2, 3);
        double result = rectangle.calculateArea();
        assertEquals(result, 6, 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle1", 2, 3);
        double result = rectangle.calculatePerimeter();
        assertEquals(result, 10, 0.01);
    }

    @Test
    void shouldCalculate0Area() {
        Rectangle rectangle = new Rectangle("Rectangle1", 0, 0);
        double result = rectangle.calculateArea();
        assertEquals(result, 0, 0.01);
    }

    @Test
    void shouldCalculate0Perimeter() {
        Rectangle rectangle = new Rectangle("Rectangle1", 0, 0);
        double result = rectangle.calculatePerimeter();
        assertEquals(result, 0, 0.01);
    }

}