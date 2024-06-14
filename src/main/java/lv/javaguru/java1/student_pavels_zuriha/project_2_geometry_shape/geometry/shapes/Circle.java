package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

import static java.lang.Math.PI;

class Circle extends Shape {

    private double circleRadius;

    Circle(String title, double circleRadius) {
        super(title);
        this.circleRadius = circleRadius;
    }

    @Override
    double calculateArea() {
        return PI * circleRadius * circleRadius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * circleRadius;
    }
}

