package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorSearchCriteriaTest {

    List<Book> testData = BookDatabaseImplTestData.getTestBooks();

    @Test
    void searchByAuthor(){
        AuthorSearchCriteria search = new AuthorSearchCriteria("King Arthur");
        ///Book book4 = new Book("King Arthur", "Modern Theory");
        Book book = testData.get(3);
        boolean result = search.match(book);
        assertTrue(result);
    }


}