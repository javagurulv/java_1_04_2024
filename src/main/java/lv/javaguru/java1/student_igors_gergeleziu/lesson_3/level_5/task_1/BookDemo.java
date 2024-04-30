package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_5.task_1;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
