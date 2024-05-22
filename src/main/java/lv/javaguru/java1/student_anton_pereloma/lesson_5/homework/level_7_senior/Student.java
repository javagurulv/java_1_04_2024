package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_7_senior;

class Student {

    private String firstName;
    private int grade;

    Student(String firstName, int grade) {
        this.firstName = firstName;
        this.grade = grade;
    }
    String getName() { return this.firstName;}
    int getGrade() { return this.grade;}
}
