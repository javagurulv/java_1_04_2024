package lv.javaguru.java1.student_natalia_kochkina.lesson_3.lessoncode;

class AppleApplication {

    public static void main(String[] args) {

        Apple apple1 = new Apple("Antonovka", "red", 400);
        Apple apple2 = new Apple("Antonovka", "green", 300);
        Apple apple3 = new Apple("Antonovka", "yellow", 300);

        System.out.println("Apple 1 type " + apple1.getType());
        System.out.println("Apple 2 type " + apple2.getType());
        System.out.println("Apple 3 type " + apple3.getType());

        System.out.println("Apple 1 color " + apple1.getColor());
        System.out.println("Apple 2 color " + apple2.getColor());
        System.out.println("Apple 3 color " + apple3.getColor());

        System.out.println("Apple 1 weight " + apple1.getWeight());
        System.out.println("Apple 2 weight " + apple2.getWeight());
        System.out.println("Apple 3 weight " + apple3.getWeight());

    }
}
