package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_4_5;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println("Circle Area = " + circleArea);
        System.out.println("Circle Perimeter = " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println("Square Area = " + squareArea);
        System.out.println("Square Perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        System.out.println("Rectangle Area = " + rectangleArea);
        System.out.println("Rectangle Perimeter = " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.println("Triangle Area = " + triangleArea);
        System.out.println("Triangle Perimeter = " + trianglePerimeter);
    }

}
