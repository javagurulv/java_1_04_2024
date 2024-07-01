package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    List<Book> testData = BookDatabaseImplTestData.getTestBooks();
    BookDatabaseImpl impl = new BookDatabaseImpl(testData);

    @Test
    void findByComplexCriteria(){
        OrSearchCriteria search = new OrSearchCriteria( new TitleSearchCriteria("Modern Theory") ,
                                                        new AuthorSearchCriteria("Mandy Wood"));
//        Book book3 = new Book("Mandy Wood", "Don't know", "2003");
//        Book book4 = new Book("King Arthur", "Modern Theory", "2000");
//        Book book6 = new Book("Mandy Wood", "Don't know again", "1867");
        List<Book> result = impl.find(search);
        String author = result.get(1).getAuthor();
        assertEquals(3, result.size());
        assertEquals("King Arthur", author);
    }

}