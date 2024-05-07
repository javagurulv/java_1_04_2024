package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_7_senior.Task_3;

class DogApp
{
    public static void main(String[] args) {
        Dog dog = new Dog("Misha", 3);

        dog.setName("Ljosha");
        dog.setAge(10);

        dog.voice();
        dog.birthday();
        dog.age();

    }
}
