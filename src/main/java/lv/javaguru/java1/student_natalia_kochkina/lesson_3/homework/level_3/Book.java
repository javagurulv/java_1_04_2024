package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_3;

class Book {

    private String name;
    private String author;
    private int year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String name, String author, int year,
                Chapter chapter1, Chapter chapter2) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public Chapter getChapter1() {
        return this.chapter1;
    }

    public Chapter getChapter2() {
        return this.chapter2;
    }
}
