package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.map.level_1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

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

    @Test
    void shouldFindBookByID1() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        Optional<Book> findingBook = bookDatabase.findById(3L);
        assertEquals(new Book("Author3", "Title3"), findingBook.get());
    }

    @Test
    void shouldFindBookByID2() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        Optional<Book> findingBook = bookDatabase.findById(4L);
        assertEquals(false, findingBook.isPresent());
    }

    @Test
    void shouldFindBooksByAuthor1() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        bookDatabase.save(new Book("Author2", "Title4"));
        List<Book> result = bookDatabase.findByAuthor("Author2");
        assertEquals(2, result.size());
    }

    @Test
    void shouldFindBooksByAuthor2() {
        bookDatabase.save(new Book("Author1", "Title1"));
        bookDatabase.save(new Book("Author2", "Title2"));
        bookDatabase.save(new Book("Author3", "Title3"));
        bookDatabase.save(new Book("Author2", "Title4"));
        List<Book> result = bookDatabase.findByAuthor("Author4");
        assertEquals(0, result.size());
    }

}