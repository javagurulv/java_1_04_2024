package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}