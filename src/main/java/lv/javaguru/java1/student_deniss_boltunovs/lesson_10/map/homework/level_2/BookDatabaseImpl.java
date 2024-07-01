package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> books;

    BookDatabaseImpl() {
        this.books = new ArrayList<>();
    }

    BookDatabaseImpl(List<Book> newBooks) {
        this.books = newBooks;
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
            if (book.getId().equals(bookId)) {
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksFound = new ArrayList<>();
        for (Book book : books){
            if (searchCriteria.match(book)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}
