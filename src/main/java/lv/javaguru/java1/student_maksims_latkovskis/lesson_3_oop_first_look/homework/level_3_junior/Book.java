package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_3_junior;

class Book {

    private String title;
    private String author;
    private int yearPublished;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int yearPublished, Chapter chapter1, Chapter chapter2){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYearPublished(){
        return this.yearPublished;
    }

    public Chapter getChapter1(){
        return this.chapter1;
    }
    public Chapter getChapter2(){
        return this.chapter2;
    }

}
