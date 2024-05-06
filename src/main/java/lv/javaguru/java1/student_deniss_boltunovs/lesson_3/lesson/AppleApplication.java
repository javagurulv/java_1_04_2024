package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

public class AppleApplication {

    public static void main(String[] args) {

        Apple apple1 = new Apple("antonovka", "red", 150) ;

        System.out.println("Apple 1 type " + apple1.getType()) ;
        System.out.println("Apple 1 color " + apple1.getColor()) ;
        System.out.println("Apple 1 weight " + apple1.getWeight()) ;

    }
}
