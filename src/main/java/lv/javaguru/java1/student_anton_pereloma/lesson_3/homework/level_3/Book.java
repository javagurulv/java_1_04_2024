package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_3;

class Book {
    private String title;
    private String author;
    private int publishedYear;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title,
                String author,
                int publishedYear,
                Chapter chapter1,
                Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }


    public String getTitle() {
        return this.title;
    }
    public Chapter getChapter1() {
        return this.chapter1;
    }
    public Chapter getChapter2() {
        return this.chapter2;
    }


}

