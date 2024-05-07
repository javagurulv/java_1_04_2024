package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

public class bookApp {
    public static void main(String[] args) {



        chapter chapter1 = new chapter("Chapter 1", "This is the text of chapter 1.");
        chapter chapter2 = new chapter("Chapter 2", "This is the text of chapter 2.");




        book book1 = new book("Book 1", "Author 1", 2022, chapter1, chapter2);
        book book2 = new book("Book 2", "Author 2", 2023, chapter2, chapter1);




        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Chapter 1: " + book1.getChapter1().getTitle());
        System.out.println("Chapter 2: " + book1.getChapter2().getTitle());




        System.out.println("Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year: " + book2.getYear());
        System.out.println("Chapter 1: " + book2.getChapter1().getTitle());
        System.out.println("Chapter 2: " + book2.getChapter2().getTitle());
    }
}
