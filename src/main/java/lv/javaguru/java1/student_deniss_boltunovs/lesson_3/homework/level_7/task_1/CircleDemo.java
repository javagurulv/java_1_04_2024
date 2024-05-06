package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_1;

class CircleDemo {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.7);
        Circle circle2 = new Circle(1.2);

        double circleArea = circle1.calculateArea();
        System.out.println("1 circle area: " + circleArea);

        circleArea =  circle2.calculateArea();
        System.out.println("2 circle area: " + circleArea);

    }
}
