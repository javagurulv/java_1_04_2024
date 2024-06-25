package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rectangle1 = new Rectangle("Rectangle1", 3, 4);
        double area1 = rectangle1.calculateArea();
        assertEquals(area1, 12, 2);

        Rectangle rectangle2 = new Rectangle("Rectangle2", 0, 0);
        double area2 = rectangle2.calculateArea();
        assertEquals(area2, 0, 2);
    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle1 = new Rectangle("Rectangle1", 3, 4);
        double perimeter1 = rectangle1.calculatePerimeter();
        assertEquals(perimeter1, 14, 2);

        Rectangle rectangle2 = new Rectangle("Rectangle2", 0, 0);
        double perimeter2 = rectangle2.calculatePerimeter();
        assertEquals(perimeter2, 0, 2);
    }

}