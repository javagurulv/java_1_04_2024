package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_3;

class BookApp {
    public static void main(String[] args) {
        BookApp bookApp = new BookApp();
        Book book1 = new Book("Book1", "Author1", 2001,
                new Chapter("Chapter1", "Text1"),
                new Chapter("Chapter2", "Text2"));
        Book book2 = new Book("Book2", "Author2", 2002,
                new Chapter("Chapter3", "Text3"),
                new Chapter("Chapter4", "Text4"));
        bookApp.printInfo(book1);
        bookApp.printInfo(book2);

    }

    void printInfo(Book book) {
        System.out.println("Book name: " + book.getBookName());
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Book year: " + book.getYear());
        System.out.println("Book Chapter1 name: " + book.chapter1.getChapterName());
        System.out.println("Book Chapter1 text: " + book.chapter1.getText());
        System.out.println("Book Chapter2 name: " + book.chapter2.getChapterName());
        System.out.println("Book Chapter2 text: " + book.chapter2.getText());
        System.out.println();
    }
}
