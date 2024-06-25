package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateArea() {
        Triangle triangle1 = new Triangle("Triangle1", 3);
        double area1 = triangle1.calculateArea();
        assertEquals(area1, 3.90, 2);

        Triangle triangle2 = new Triangle("Triangle2", 0);
        double area2 = triangle2.calculateArea();
        assertEquals(area2, 0, 2);
    }

    @Test
    void calculatePerimeter() {
        Triangle triangle1 = new Triangle("Triangle1", 3);
        double perimeter1 = triangle1.calculatePerimeter();
        assertEquals(perimeter1, 9, 2);

        Triangle triangle2 = new Triangle("Triangle2", 0);
        double perimeter2 = triangle2.calculatePerimeter();
        assertEquals(perimeter2, 0, 2);
    }
}