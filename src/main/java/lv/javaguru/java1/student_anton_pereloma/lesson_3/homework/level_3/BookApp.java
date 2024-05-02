package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_3;

public class BookApp {
    public static void main(String[] args) {
//        Book book1 = new Book("Count Monte Christo","Alexander Dumas", 1845,);
        Book book1 = new Book(
                "Count Monte Christo",
                "Dumas",
                1845,
                new Chapter(
                        "Marseilles - The Arrival",
                        "Lorem ipsum dolor sit amet"
                ),
                new Chapter(
                        "Father and Son",
                        "Lorem ipsum dolor sit amet"
                )
        );
    }
}
