package lv.javaguru.java1.student_nikita_paramonovs.lesson_2;

class AppleApplication {
    public static void main(String[] args) {
        Apple apple1 = new Apple("antonovka","green",309);
        Apple apple2 = new Apple("antonovka","red",368);
        Apple apple3 = new Apple("antonovka","yellow",184);

        System.out.println("Apple 1 type " +apple1.getType());
        System.out.println("Apple 1 type " +apple2.getType());
        System.out.println("Apple 1 type " +apple3.getType());

        System.out.println("Apple 1 color "+apple1.getColor());
        System.out.println("Apple 1 color "+apple2.getColor());
        System.out.println("Apple 1 color "+apple3.getColor());

        System.out.println("Apple 1 weight "+apple1.getWeight());
        System.out.println("Apple 1 weight "+apple2.getWeight());
        System.out.println("Apple 1 weight "+apple3.getWeight());

    }
}
