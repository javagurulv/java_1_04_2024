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

           assertEquals(6, totalBooks);
           assertEquals(6L, result);
       }

        @Test
        void shouldDeleteByBookId(){
            String author = impl.getBooks().get(3).getAuthor();
            boolean result = impl.delete(4L);
            int totalBooks = impl.getBooks().size();

            assertEquals("King Arthur", author);
            assertEquals(4, totalBooks);
            assertTrue(result);
        }

        @Test
        void shouldDeleteByBook(){
            Book bookToDelete = testData.get(2);
            boolean result = impl.delete(bookToDelete);
            int totalBooks = impl.getBooks().size();

            assertEquals(4, totalBooks);
            assertTrue(result);
        }

}