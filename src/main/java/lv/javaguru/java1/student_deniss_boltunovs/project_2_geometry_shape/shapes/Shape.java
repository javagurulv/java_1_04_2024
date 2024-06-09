package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
