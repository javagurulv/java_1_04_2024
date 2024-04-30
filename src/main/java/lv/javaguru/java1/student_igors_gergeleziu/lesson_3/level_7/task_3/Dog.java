package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_7.task_3;

class Dog {
    private String nickname;
    private int age;

    Dog(String name, int age) {
        this.nickname = name;
        this.age = age;
    }

    void bark() {
        System.out.println("My nickname is " + this.nickname);
    }

    void happyBirthday() {
        this.age += 1;
        System.out.println("It is my birthday, Im " + this.age + " years now!");
    }

    int getAge() {
        return this.age;
    }
}
