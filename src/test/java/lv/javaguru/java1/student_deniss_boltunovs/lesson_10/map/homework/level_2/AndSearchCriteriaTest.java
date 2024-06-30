package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {

    List<Book> testData = BookDatabaseImplTestData.getTestBooks();

    @Test
    void andSearchCriteria(){
        AndSearchCriteria search = new AndSearchCriteria( new AuthorSearchCriteria("Jonathan Swift"),
                                                          new YearOfIssueSearchCriteria("1677") );
        /// Book book5 = new Book("Jonathan Swift", "Gulliver's Travels", "1677");
        Book book = testData.get(4);
        boolean result = search.match(book);
        assertTrue(result);
    }

    @Test
    void andSearchCriteria2(){
        AndSearchCriteria search = new AndSearchCriteria( new YearOfIssueSearchCriteria("1867"),
                                                          new TitleSearchCriteria("Don't know again") );
        /// Book book6 = new Book("Mandy Wood", "Don't know again", "1867");
        Book book = testData.get(5);
        boolean result = search.match(book);
        assertTrue(result);
    }

}