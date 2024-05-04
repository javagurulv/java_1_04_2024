package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String sayHello() {
        return "My name is " + name;
    }

    String sayAge() {
        if (this.age != 1) {
            return "I'm " + this.age + " years old.";
        } else {
            return "I'm " + this.age + " year old.";
        }
    }

    void happyBirthday() {
        this.age ++;
    }
}
