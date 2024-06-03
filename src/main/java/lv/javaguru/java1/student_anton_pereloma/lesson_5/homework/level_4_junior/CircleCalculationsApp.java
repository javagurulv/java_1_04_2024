package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_4_junior;

class CircleCalculationsApp {
    public static void main(String[] args) {
        CircleCalculations circle = new CircleCalculations();

        System.out.println("Perimeter = " + circle.findPerimeter(1));
        System.out.println("Area = " + circle.findArea(1));

        System.out.println("Perimeter = " + circle.findPerimeter(5));
        System.out.println("Area = " + circle.findArea(5));

        System.out.println("Perimeter = " + circle.findPerimeter(99));
        System.out.println("Area = " + circle.findArea(99));

    }
}
