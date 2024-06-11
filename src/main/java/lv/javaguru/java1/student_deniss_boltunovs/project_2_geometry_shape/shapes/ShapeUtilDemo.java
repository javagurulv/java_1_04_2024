package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil util = new ShapeUtil();
        Shape circle = util.createRandomCircle();
        double circleArea = util.calculateArea(circle);
        double circlePerimeter = util.calculatePerimeter(circle);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);

    }

}
