package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * ( Math.pow(radius,2));
    }

    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    double getRadius(){
        return radius;
    }

}
