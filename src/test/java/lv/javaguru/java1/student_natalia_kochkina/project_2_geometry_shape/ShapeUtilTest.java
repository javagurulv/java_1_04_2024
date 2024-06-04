package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    private ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    void shouldCalculateArea() {
        Shape[] shapes = {
                new Circle("Circle1", 4),
                new Square("Square1", 4),
                new Rectangle("Rectangle1", 4, 5)
        };
        double result = shapeUtil.calculateArea(shapes);
        assertEquals(result, 86.26, 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Shape[] shapes = {
                new Circle("Circle2", 3.5),
                new Square("Square2", 4),
                new Rectangle("Rectangle2", 4, 5)
        };
        double result = shapeUtil.calculatePerimeter(shapes);
        assertEquals(result, 55.99, 0.01);
    }

    @Test
    void shouldCalculate0Area() {
        Shape[] shapes = {
                new Circle("Circle3", 0),
                new Square("Square3", 0),
                new Rectangle("Rectangle3", 0, 0)
        };
        double result = shapeUtil.calculateArea(shapes);
        assertEquals(result, 0, 0.01);
    }

    @Test
    void shouldCalculate0Perimeter() {
        Shape[] shapes = {
                new Circle("Circle4", 0),
                new Square("Square4", 0),
                new Rectangle("Rectangle4", 0, 0)
        };
        double result = shapeUtil.calculatePerimeter(shapes);
        assertEquals(result, 0, 0.01);
    }

    @Test
    void shouldFindEquals1() {
        List<Shape> shapes = List.of(
                new Circle("Circle5", 10),
                new Square("Square5", 3),
                new Circle("Circle5", 10),
                new Rectangle("Rectangle5", 4, 2),
                new Square("Square5", 10)
        );
        Circle circle = new Circle("Circle5", 10);
        List<Shape> result = shapeUtil.findEquals(shapes, circle);
        assertEquals(result.size(), 2);
    }

    @Test
    void shouldFindEquals2() {
        List<Shape> shapes = List.of(
                new Circle("Circle5", 10),
                new Square("Square5", 3),
                new Circle("Circle3", 10),
                new Square("Square5", 3),
                new Rectangle("Rectangle5", 4, 2),
                new Square("Square5", 10),
                new Square("Square5", 10),
                new Square("Square5", 3)
        );
        Square square = new Square("Square5", 3);
        List<Shape> result = shapeUtil.findEquals(shapes, square);
        assertEquals(result.size(), 3);
    }

}