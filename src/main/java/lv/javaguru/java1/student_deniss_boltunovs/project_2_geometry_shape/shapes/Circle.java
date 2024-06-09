package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * ( Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius(){
        return radius;
    }
}
