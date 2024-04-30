package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_3;

class Book {
    private String bookName;
    private String author;
    private int year;
    Chapter chapter1;
    Chapter chapter2;

    Book(String name, String author, int year, Chapter chapter1, Chapter chapter2) {
        this.bookName = name;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    String getBookName() {
        return bookName;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    Chapter getChapter1() {
        return chapter1;
    }

    Chapter getChapter2() {
        return chapter2;
    }

    @Override
    public String toString() {
        return "" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", chapter1=" + chapter1 +
                ", chapter2=" + chapter2;
    }
}
