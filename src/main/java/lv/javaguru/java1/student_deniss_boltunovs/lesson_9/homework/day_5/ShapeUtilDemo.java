package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_5;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil util = new ShapeUtil();

        Shape circle = util.createRandomCircle();
        double circleArea = util.calculateArea(circle);
        double circlePerimeter = util.calculatePerimeter(circle);

        System.out.println("circle area: " + circleArea);
        System.out.println("circle perimeter: " + circlePerimeter);

    }
}
