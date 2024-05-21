package lv.javaguru.java1.student_jelena_k.lesson2.homework;

public class Book {
    private String title;
    private String  author;
    private int year;
    private String chapter1;
    private String chapter2;

    public Book(String title, String author, int year, String chapter1, String chapter2) {
       this.title = title;
       this.author = author;
       this.year = year;
       this.chapter1 = chapter1;
       this.chapter2 = chapter2;

    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getChapter1() { return chapter1; }
    public String getChapter2() { return chapter2; }

    public void setTitle(String title) { this.title = title;}
    public void setAuthor(String author) { this.author = author;}
    public void setYear(int year) { this.year = year;}
    public void  setChapter1(String chapter1) { this.chapter1 = chapter1;}
    public  void setChapter2(String chapter2) { this.chapter2 = chapter2;}
}
