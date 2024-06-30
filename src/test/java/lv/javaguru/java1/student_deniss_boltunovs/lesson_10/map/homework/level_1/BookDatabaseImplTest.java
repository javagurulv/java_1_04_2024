package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

       List<Book> testData = BookDatabaseImplTestData.getTestBooks();
       BookDatabaseImpl impl = new BookDatabaseImpl(testData);

       @Test
       void shouldAddNewBooks(){
           Long result = impl.save(new Book("New Author", "Also new book"));
           int totalBooks = impl.getBooks().size();
           assertEquals(7, totalBooks);
           assertEquals(7L, result);
       }

        @Test
        void shouldDeleteByBookId(){
            boolean result = impl.delete(4L);
            int totalBooks = impl.getBooks().size();
            assertEquals(5, totalBooks);
            assertTrue(result);
        }

        @Test
        void shouldDeleteByBook(){
            Book bookToDelete = testData.get(2);
            boolean result = impl.delete(bookToDelete);
            int totalBooks = impl.getBooks().size();
            assertEquals(5, totalBooks);
            assertTrue(result);
        }

        @Test
        void shouldFindByAuthor(){
            List<Book> result = impl.findByAuthor("Mandy Wood");
            List<Book> result2 = impl.findByAuthor("Johnson");
            assertEquals(2, result.size());
            assertEquals(1, result2.size());
        }

        @Test
        void shouldFindByTitle(){
            List<Book> result = impl.findByTitle("Gulliver's Travels");
            List<Book> result2 = impl.findByTitle("Treasury Island");
            assertEquals(2, result.size());
            assertEquals(1, result2.size());
        }

        @Test
        void shouldCountAllBooks(){
            int result = impl.countAllBooks();
            assertEquals(6, result);
        }

}