package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_3.task_4;

class Bird extends Animal {

    Bird(String name){
        super(name);
    }

    void move(){
        System.out.println(getName() + " flying very high");
    }

}
