package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_4;

class CircleMeasures {

    public void circlePerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter: " + perimeter);
    }

    public void circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + area);
    }

}
