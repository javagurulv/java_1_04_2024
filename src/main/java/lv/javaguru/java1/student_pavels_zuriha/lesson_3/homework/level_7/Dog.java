package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_7;

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "My nickname is " + this.name;
    }

    public void addAge(int age) {
        this.age = this.age + 1;

    }

    public int getAge() {
        return this.age;
    }

}

class DogApp {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 2);

        dog.addAge(1);
        System.out.println(dog.getName());
        System.out.println("I'm this years old: " + dog.getAge());

    }


}
