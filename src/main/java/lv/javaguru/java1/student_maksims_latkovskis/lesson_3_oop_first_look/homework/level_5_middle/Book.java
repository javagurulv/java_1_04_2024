package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_5_middle;

class Book {

    private String title;

    public Book(String bookTitle) {
        this.title = bookTitle;
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
