package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_3;

class Dog {
    private String nickname;
    private int age;


    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String bark() {
        return "My nickname is " + nickname;
    }

    public void celebrateBirthday() {
        age++;
    }

    public int getAge() {
        return age;
    }
}
