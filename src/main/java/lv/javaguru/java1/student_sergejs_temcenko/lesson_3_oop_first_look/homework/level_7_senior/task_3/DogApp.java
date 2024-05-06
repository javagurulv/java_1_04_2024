package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_3;

class DogApp {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik", 10);

        // Выводим кличку и возраст собаки
        System.out.println("My dog's nickname is " + myDog.getNickname());
        System.out.println("My dog is " + myDog.getAge() + " years old.");

        System.out.println(myDog.bark());

        myDog.celebrateBirthday();
        System.out.println("Now my dog is " + myDog.getAge() + " years old.");
    }
}
