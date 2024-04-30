package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

class AppleApplication {

    public static void main(String[] args) {

        Apple apple1 = new Apple("Naliv","Green", 700);
        Apple apple2 = new Apple("Naliv2","Blue", 200);
        Apple apple3 = new Apple("Naliv3","Yellow", 400);

        System.out.println("Apple 1 Type: " + apple1.getType());
        System.out.println("Apple 1 Color: " + apple1.getColor());
        System.out.println("Apple 1 Weight: " + apple1.getWeight());

    }
}
