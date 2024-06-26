package lv.javaguru.java1.teacher.project_2_geometry_shape.step_4.geometry.shapes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
