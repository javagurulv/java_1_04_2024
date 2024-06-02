package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

import java.util.Objects;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(title, shape.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

}
