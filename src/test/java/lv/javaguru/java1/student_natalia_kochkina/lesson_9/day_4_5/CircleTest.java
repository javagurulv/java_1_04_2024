package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculateArea() {
        Circle circle1 = new Circle("Circle1", 4);
        double area1 = circle1.calculateArea();
        assertEquals(area1, 50.26, 0.01);

        Circle circle2 = new Circle("Circle2", 0);
        double area2 = circle2.calculateArea();
        assertEquals(area2, 0, 0.01);
    }

    @Test
    void calculatePerimeter() {
        Circle circle1 = new Circle("Circle1", 4);
        double perimeter1 = circle1.calculatePerimeter();
        assertEquals(perimeter1, 25.13, 0.01);

        Circle circle2 = new Circle("Circle2", 0);
        double perimeter2 = circle2.calculatePerimeter();
        assertEquals(perimeter2, 0, 0.01);
    }
}