package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> books;

    BookDatabaseImpl() {
        this.books = new ArrayList<>();
    }

    List<Book> getBooks() {
        return books;
    }

    @Override
    public Long save(Book book){
        int totalBooks = books.size();
        //// when book is new
        if (book.getId() == null) {
            Long id = (long) totalBooks + 1;
            book.setId(id);
            books.add(book);
            return id;
        } else {
            return book.getId();
        }
    }

    @Override
    public boolean delete(Long bookId){
        for (Book book : books) {
            if (book.getId() == bookId) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book){
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    @Override
    public int countAllBooks(){
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author){
        books = books.stream()
                .filter(b -> !(b.getAuthor().equals(author)))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteByTitle(String title){
        books = books.stream()
                .filter(b -> !(b.getTitle().equals(title)))
                .collect(Collectors.toList());
    }

}
