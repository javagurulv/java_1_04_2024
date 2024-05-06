package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_3;

public class BookApp {

    public static void main(String[] args) {

         Chapter chapter1 = new Chapter("Intro", "this is text for first chapter introduction");
         Chapter chapter2 = new Chapter("Action", "this is text for second chapter action");

         Book book1 = new Book("Treasure Island", "Robert Louis Stevenson", 1883, chapter1, chapter2);

         chapter1 = new Chapter("New Horizon", "this is text for chapter 1");
         chapter2 = new Chapter("Moving fast", "this is text for chapter 2");

         Book book2 = new Book("Gulliver`s Travels", "Jonathan Swift", 1726, chapter1, chapter2);

         /// Book 1
         System.out.println("First book: " + book1.getTitle());
         System.out.println("Publishing Year: " + book1.getPublishingYear());

         System.out.println(" ");

         /// Book 2
         System.out.println("Second book: " + book2.getTitle());
         System.out.println("Publishing Year: " + book2.getPublishingYear());
         System.out.println("Chapter 1: " + book2.getChapter1().getTitle());
         System.out.println("Chapter 1 text: " + book2.getChapter1().getText());

    }
}
