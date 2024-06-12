package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class Rectangle extends Shape {

    private double sideLength;
    private double sideWidth;

    Rectangle(String title, double lengthSide, double sideWidth) {
        super(title);
        this.sideLength = lengthSide;
        this.sideWidth = sideWidth;
    }

    @Override
    double calculateArea() {
        return sideLength * sideWidth;
    }

    @Override
    double calculatePerimeter() {
        return (2 * sideLength) + (2 * sideWidth);
    }
}
