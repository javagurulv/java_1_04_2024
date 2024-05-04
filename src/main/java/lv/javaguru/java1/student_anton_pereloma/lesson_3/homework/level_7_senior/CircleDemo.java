package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(10);
        double circleArea = firstCircle.getArea();
        System.out.println("Circle Area with a radius of " + firstCircle.getRadius() + " is: " + circleArea);
    }
}
