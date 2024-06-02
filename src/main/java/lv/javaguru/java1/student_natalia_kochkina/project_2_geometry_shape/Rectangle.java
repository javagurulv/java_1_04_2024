package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import java.util.Objects;

class Rectangle extends Shape {

    private double side1;
    private double side2;

    Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return side1 * side2;
    }

    @Override
    double calculatePerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(side1, rectangle.side1) == 0
                && Double.compare(side2, rectangle.side2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side1, side2);
    }
}
