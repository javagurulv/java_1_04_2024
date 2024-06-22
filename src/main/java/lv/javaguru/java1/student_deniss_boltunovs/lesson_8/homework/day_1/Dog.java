package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_1;

class Dog {

    private String name;
    private String colour;
    private int age;

    Dog(String name, String color, int age){
         this.name = name;
         this.colour =  color;
         this.age = age;
     }

     String getName(){
        return name;
     }

     String getColour(){
        return colour;
     }

     int getAge() {
        return age;
    }

}
