package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.lessoncode;

public class AppleApp {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Ranetka", "red", 10);
        Apple apple2 = new Apple("Antonovka", "blue", 15);
        Apple apple3 = new Apple("Naliv", "green", 5);

        System.out.println("nasi jabloki: " + apple1.getType());
        System.out.println("nasi jabloki: " + apple2.getType());
        System.out.println("nasi jabloki: " + apple3.getType());

        System.out.println("cvet jablok: " + apple1.getColor());
        System.out.println("cvet jablok: " + apple2.getColor());
        System.out.println("cvet jablok: " + apple3.getColor());

        System.out.println("ves jablok: " + apple1.getWeight());
        System.out.println("ves jablok: " + apple2.getWeight());
        System.out.println("ves jablok: " + apple3.getWeight());
    }
}
