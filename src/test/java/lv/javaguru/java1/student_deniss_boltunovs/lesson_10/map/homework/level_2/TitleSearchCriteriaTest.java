package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    List<Book> testData = BookDatabaseImplTestData.getTestBooks();

    @Test
    void searchByTitle(){
        TitleSearchCriteria search = new TitleSearchCriteria("Gulliver's Travels");
        // Book book5 = new Book("Jonathan Swift", "Gulliver's Travels");
        Book book = testData.get(4);
        boolean result = search.match(book);
        assertTrue(result);
    }

}