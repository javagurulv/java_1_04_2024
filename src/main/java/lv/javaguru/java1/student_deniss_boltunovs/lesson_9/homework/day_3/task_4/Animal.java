package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_3.task_4;

abstract class Animal {

    String name;

    Animal(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    abstract void move();

}
