package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    void calculateArea() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle",4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 4);
        shapes[3] = new Triangle("Triangle", 4);
        double shapesArea = shapeUtil.calculateArea(shapes);
        assertEquals(shapesArea, 89.19, 0.01);
    }

    @Test
    void calculatePerimeter() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle",4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 4);
        shapes[3] = new Triangle("Triangle", 4);
        double shapesPerimeter = shapeUtil.calculatePerimeter(shapes);
        assertEquals(shapesPerimeter, 69.13, 0.01);
    }
}