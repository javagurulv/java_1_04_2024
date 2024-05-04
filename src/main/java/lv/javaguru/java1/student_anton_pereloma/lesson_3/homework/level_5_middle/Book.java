package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_5_middle;

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