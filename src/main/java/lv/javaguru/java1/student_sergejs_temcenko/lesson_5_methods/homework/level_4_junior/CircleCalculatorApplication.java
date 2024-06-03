package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_4_junior;

class CircleCalculatorApplication {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator(5);

        double area = circleCalculator.calculateArea();
        System.out.println(area);

        double perimeter = circleCalculator.calculatePerimeter();
        System.out.println(perimeter);

        circleCalculator.setRadius();
        System.out.println("CircleArea radius 8: " + circleCalculator.calculateArea());
        System.out.println("CirclePerimeter radius 8: " + circleCalculator.calculatePerimeter());

    }

}
