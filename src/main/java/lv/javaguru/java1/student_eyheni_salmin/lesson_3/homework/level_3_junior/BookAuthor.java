package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_3_junior;

public class BookAuthor {
    private String name;
    private String surName;

    public BookAuthor(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
