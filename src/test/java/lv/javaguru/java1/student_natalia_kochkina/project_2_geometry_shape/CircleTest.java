package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        Circle circle = new Circle("Circle1", 2.5);
        double result = circle.calculateArea();
        assertEquals(result, 19.63, 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Circle circle = new Circle("Circle2", 3.5);
        double result = circle.calculatePerimeter();
        assertEquals(result, 21.99, 0.01);
    }

    @Test
    void shouldCalculate0Area() {
        Circle circle = new Circle("Circle3", 0);
        double result = circle.calculateArea();
        assertEquals(result, 0, 0.01);
    }

    @Test
    void shouldCalculate0Perimeter() {
        Circle circle = new Circle("Circle4", 0);
        double result = circle.calculatePerimeter();
        assertEquals(result, 0, 0.01);
    }

}