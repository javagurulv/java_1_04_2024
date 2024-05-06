package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_3_junior;

import lv.javaguru.java1.student_nadezda_radigina.lesson3.level3.Chapter;

class Book {
    private String title;
    private String author;
    private int releaseYear;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int releaseYear, Chapter chapter1, Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
