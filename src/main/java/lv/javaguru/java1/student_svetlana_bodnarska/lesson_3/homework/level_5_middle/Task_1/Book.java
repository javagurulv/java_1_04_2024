package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_5_middle.Task_1;

class Book
{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
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

