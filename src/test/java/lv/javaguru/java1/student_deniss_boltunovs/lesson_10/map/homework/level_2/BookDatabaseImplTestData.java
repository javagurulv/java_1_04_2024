package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImplTestData {

    public static List<Book> getTestBooks(){
        List<Book> testBooks = new ArrayList<>();
        Book book1 = new Book("Johnson", "Treasury Island", "1987");
        Book book2 = new Book("Jonathan Swift", "Gulliver's Travels", "1876");
        Book book3 = new Book("Mandy Wood", "Don't know", "2003");
        Book book4 = new Book("King Arthur", "Modern Theory", "2000");
        Book book5 = new Book("Jonathan Swift", "Gulliver's Travels", "1677");
        Book book6 = new Book("Mandy Wood", "Don't know again", "1867");

        book1.setId(1L);
        book2.setId(2L);
        book3.setId(3L);
        book4.setId(4L);
        book5.setId(5L);
        book6.setId(6L);

        testBooks.add(book1);
        testBooks.add(book2);
        testBooks.add(book3);
        testBooks.add(book4);
        testBooks.add(book5);
        testBooks.add(book6);

        return testBooks;
    }

}
