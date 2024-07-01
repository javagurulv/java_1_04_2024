package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    List<Book> testData = BookDatabaseImplTestData.getTestBooks();

    @Test
    void orSearchCriteriaByAuthor(){
        OrSearchCriteria search = new OrSearchCriteria( new AuthorSearchCriteria("Jonathan Swift"),
                                                        new YearOfIssueSearchCriteria("1977") );
        /// Book book5 = new Book("Jonathan Swift", "Gulliver's Travels", "1677");
        Book book = testData.get(4);
        boolean result = search.match(book);
        assertTrue(result);
    }

    @Test
    void orSearchCriteriaByTitle(){
        OrSearchCriteria search = new OrSearchCriteria( new AuthorSearchCriteria("Albert"),
                new TitleSearchCriteria("Gulliver's Travels") );
        /// Book book5 = new Book("Jonathan Swift", "Gulliver's Travels", "1677");
        Book book = testData.get(4);
        boolean result = search.match(book);
        assertTrue(result);
    }

}