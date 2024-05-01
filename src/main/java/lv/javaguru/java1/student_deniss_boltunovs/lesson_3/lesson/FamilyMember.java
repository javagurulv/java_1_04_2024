package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class FamilyMember {

    private String name;
    private String surname;
    private int age;

    public FamilyMember(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

}
