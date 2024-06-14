package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class Square extends Shape {

    private double lengthSide;

    Square(String title, double lengthSide) {
        super(title);
        this.lengthSide = lengthSide;
    }


    @Override
    double calculateArea() {
        return lengthSide * lengthSide;
    }

    @Override
    double calculatePerimeter() {
        return lengthSide * 4;
    }
}
