package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_4;

import java.math.BigDecimal;

class CirclePerimeterAndAreaApp {

    public static void main(String[] args) {
        CirclePerimeterAndArea circlePerimeterAndArea = new CirclePerimeterAndArea();

        BigDecimal radius = new BigDecimal("6.5");

        System.out.println("Perimeter = " + circlePerimeterAndArea.calculatePerimeter(radius));
        System.out.println("Area = " + circlePerimeterAndArea.calculateArea(radius));
    }
}
