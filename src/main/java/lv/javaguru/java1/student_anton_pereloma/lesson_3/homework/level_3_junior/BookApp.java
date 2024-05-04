package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_3_junior;

class BookApp {
    public static void main(String[] args) {
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

        System.out.println("Chapter 1: " + book1.getChapter1().getChapterTitle());
        System.out.println("Chapter Text: \n" + book1.getChapter1().getChapterText());


        Book book2 = new Book(
                "Animal Farm",
                "Orwell",
                1945,
                new Chapter(
                        "Chapter 1",
                        "Lorem ipsum dolor sit amet"
                ),
                new Chapter(
                        "Chapter 2",
                        "Lorem ipsum dolor sit amet"
                )

        );
        System.out.println();
        System.out.println("Chapter 1: " + book2.getChapter1().getChapterTitle());
        System.out.println("Chapter Text: \n" + book2.getChapter1().getChapterText());

    }
}
