package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_1;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImplTestData {

    public static List<Book> getTestBooks(){
        List<Book> testBooks = new ArrayList<>();
        Book book1 = new Book("Johnson", "Treasury Island");
        Book book2 = new Book("Jonathan Swift", "Gulliver's Travels");
        Book book3 = new Book("Mandy Wood", "Don't know");
        Book book4 = new Book("King Arthur", "Modern Theory");
        Book book5 = new Book("Jonathan Swift", "Gulliver's Travels");

        book1.setId(1L);
        book2.setId(2L);
        book3.setId(3L);
        book4.setId(4L);
        book5.setId(5L);

        testBooks.add(book1);
        testBooks.add(book2);
        testBooks.add(book3);
        testBooks.add(book4);
        testBooks.add(book5);

        return testBooks;
    }

}
