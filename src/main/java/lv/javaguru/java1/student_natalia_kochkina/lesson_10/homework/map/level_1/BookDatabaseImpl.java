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
        Long index = (long) books.size();
        book.setId(index);
        return index;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    public List<Book> getBooks() {
        return books;
    }

}
