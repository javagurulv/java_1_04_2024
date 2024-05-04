package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

class DogApp {
    public static void main(String[] args) {
        Dog sampleDog = new Dog("Skippy", 2);
        System.out.println(sampleDog.sayHello());
        System.out.println(sampleDog.sayAge());
        sampleDog.happyBirthday();
        System.out.println(sampleDog.sayAge());
    }
}
