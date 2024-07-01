package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.map.level_1;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> books;

    public BookDatabaseImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public Long save(Book book) {
        books.add(book);
        Long index = Long.valueOf(books.size());
        book.setId(index);
        return index;
    }

}
