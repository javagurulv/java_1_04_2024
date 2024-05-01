package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_7;

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void gavgav() {
        System.out.println("My nickname is " + this.name);
    }

    public void celebrateBirthday() {
        this.age = this.age + 1;
    }

    public int getAge() {
        return age;
    }
}
