package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import java.util.Objects;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
