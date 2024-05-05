package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode.family;

class Mother {

    private String firstName;
    private String lastName;
    private int age;

    public Mother(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    String getFirstName() {
        return this.firstName;

    }

    String getLastName() {
        return this.lastName;

    }

    int getAge() {
        return this.age;

    }

}
