package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

class book {
    private String title;
    private String author;
    private int year;
    private chapter chapter1;
    private chapter chapter2;

    public book(String title, String author, int year, chapter chapter1, chapter chapter2) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public chapter getChapter1() {
        return chapter1;
    }

    public void setChapter1(chapter chapter1) {
        this.chapter1 = chapter1;
    }

    public chapter getChapter2() {
        return chapter2;
    }

    public void setChapter2(chapter chapter2) {
        this.chapter2 = chapter2;
    }
}


