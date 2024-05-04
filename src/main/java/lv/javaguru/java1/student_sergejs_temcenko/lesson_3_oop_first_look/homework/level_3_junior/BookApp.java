package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_3_junior;

import lv.javaguru.java1.student_nadezda_radigina.lesson3.level3.Chapter;

class BookApp {

    public static void main(String[] args) {
        //glavi
        Chapter charapter1 = new Chapter("Intro", "Hello world...");
        Chapter charapter2 = new Chapter("Intro2", "Hello Madara...");
        Book book1 = new Book("Demon", "Nik Ben", 2000, charapter1, charapter2);
        Book book2 = new Book("Demon2", "Nik Roy", 2001, charapter1, charapter2);

        System.out.println("Title of book1: " + book1.getTitle());
        System.out.println("Author of boo2: " + book2.getAuthor());
        System.out.println("Release of book1: " + book1.getReleaseYear());
        System.out.println("Chapter1 name of book1: " + book1.getChapter1().getName());
        System.out.println("Chapter1 text of book1: " + book1.getChapter1().getText());
        System.out.println("Chapter2 name of book2: " + book2.getChapter2().getName());
        System.out.println("Chapter2 text of book2: " + book2.getChapter2().getText());


    }
}
