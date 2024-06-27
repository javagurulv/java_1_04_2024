package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square square1 = new Square("Square1", 5);
        double area1 = square1.calculateArea();
        assertEquals(area1, 25, 0.01);

        Square square2 = new Square("Square2", 0);
        double area2 = square2.calculateArea();
        assertEquals(area2, 0, 0.01);
    }

    @Test
    void calculatePerimeter() {
        Square square1 = new Square("Square1", 5);
        double perimeter1 = square1.calculatePerimeter();
        assertEquals(perimeter1, 20, 0.01);

        Square square2 = new Square("Square2", 0);
        double perimeter2 = square2.calculatePerimeter();
        assertEquals(perimeter2, 0, 0.01);
    }

}