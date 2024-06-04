package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateArea() {
        Square square = new Square("Square1", 2);
        double result = square.calculateArea();
        assertEquals(result, 4, 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Square square = new Square("Square2", 2.5);
        double result = square.calculatePerimeter();
        assertEquals(result, 10, 0.01);
    }

    @Test
    void shouldCalculate0Area() {
        Square square = new Square("Square3", 0);
        double result = square.calculateArea();
        assertEquals(result, 0, 0.01);
    }

    @Test
    void shouldCalculate0Perimeter() {
        Square square = new Square("Square4", 0);
        double result = square.calculatePerimeter();
        assertEquals(result, 0, 0.01);
    }

}