package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_5;

class Book {

    private String title;

    Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
