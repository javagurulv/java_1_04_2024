package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_1;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        double area = circle1.calculateArea();
        System.out.println("Circle area: " + area);
    }
}
