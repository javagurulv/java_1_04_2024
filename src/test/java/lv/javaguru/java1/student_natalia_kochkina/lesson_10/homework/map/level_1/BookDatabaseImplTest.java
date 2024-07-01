package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.map.level_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @Test
    void shouldDeleteBookByID1() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(1L);
        assertEquals(2, bookDatabase.getBooks().size());
        assertEquals(true, result);
    }

    @Test
    void shouldDeleteBookByID2() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(4L);
        assertEquals(3, bookDatabase.getBooks().size());
        assertEquals(false, result);
    }

    @Test
    void shouldDeleteBookByBook1() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(new Book("Author1", "Title1"));
        assertEquals(2, bookDatabase.getBooks().size());
        assertEquals(true, result);
    }

    @Test
    void shouldDeleteBookByBook2() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        boolean result = bookDatabase.delete(new Book("Author5", "Title5"));
        assertEquals(3, bookDatabase.getBooks().size());
        assertEquals(false, result);
    }

}