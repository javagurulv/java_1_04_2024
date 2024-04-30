package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_7.task_3;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1= new Dog("Sharik", 3);
        dog1.bark();
        System.out.println("My age is "+dog1.getAge());
        dog1.happyBirthday();

    }
}
