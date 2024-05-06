package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_5_middle.task_1;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
