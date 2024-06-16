package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

public class AppleApp {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Антоновка", "green", 700);
        Apple apple2 = new Apple("Антоновка", "black", 500);
        Apple apple3 = new Apple("Антоновка", "white", 300);

        apple1.printApple(apple1.getType());
        apple1.printApple(apple1.getColor());
        apple1.printApple(apple1.getWeight());


        System.out.println();
        apple1.printApple(apple2.getType());
        apple1.printApple(apple2.getColor());
        apple1.printApple(apple2.getWeight());



        System.out.println();
        apple1.printApple(apple3.getType());
        apple1.printApple(apple3.getColor());
        apple1.printApple(apple3.getWeight());

    }

}

