package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_7;

class DogApp {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", 2);
        dog1.gavgav();
        dog1.celebrateBirthday();
        System.out.println("I am " + dog1.getAge() + " years old");
    }
}
