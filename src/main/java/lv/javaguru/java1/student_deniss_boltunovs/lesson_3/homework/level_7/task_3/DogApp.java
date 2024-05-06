package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_3;

class DogApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lora", 10);
        Dog dog2 = new Dog("Fiji", 5);

        System.out.println(dog1.getVoice());
        System.out.println(dog1.getAge());

        dog1.celebrateBirthday();
        System.out.println(dog1.getAge());

    }

}
