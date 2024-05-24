package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.lessoncode;

class AppleApplication {

    public static void main(String[] args){

        Apple apple1 = new Apple("Granny Smith", "Green", 0.1 );
        Apple apple2= new Apple("Braeburn", "Red", 0.12 );
        Apple apple3= new Apple("Cameo", "Striped Red", 0.09 );

        System.out.println(apple1.getKind());
        System.out.println(apple1.getColour());
        System.out.println(apple1.getWeight() + " kg");

        System.out.println(apple2.getKind());
        System.out.println(apple2.getColour());
        System.out.println(apple2.getWeight() + " kg");

        System.out.println(apple3.getKind());
        System.out.println(apple3.getColour());
        System.out.println(apple3.getWeight() + " kg");

    }

}
