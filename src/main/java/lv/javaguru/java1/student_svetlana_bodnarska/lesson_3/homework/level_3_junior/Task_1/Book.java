package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_3_junior.Task_1;

class Book {

    private String name;
    private String author;
    private int yearOfPublishing;
    private String chapter1;
    private String chapter2;

    public Book (String name, String author, int yearOfPublishing, String chapter1, String chapter2){
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYearOfPublishing(){
        return this.yearOfPublishing;
    }

    public String getChapter1(){
        return this.chapter1;
    }

    public String getChapter2(){
        return this.chapter2;
    }

}
