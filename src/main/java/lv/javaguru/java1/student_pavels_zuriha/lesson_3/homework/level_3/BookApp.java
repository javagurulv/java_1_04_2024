package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_3;

class BookApp {

    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("Chapter 1 Title", "Chapter 1 Text");
        Chapter chapter2 = new Chapter("Chapter 2 Title", "Chapter 2 Text");
        Book book1 = new Book("Name1","Author1", 2000, chapter1, chapter2);

        System.out.println("Book name: " + book1.getName());
        System.out.println("Book author: " + book1.getAuthor());
        System.out.println("Book Release Year: " + book1.getReleaseYear());
        System.out.println("Book Chapter 1 Title: " + book1.getChapter1().getChapterTitle());
        System.out.println("Book Chapter 1 Text: " + book1.getChapter1().getChapterText());
        System.out.println("Book Chapter 2 Title: " + book1.getChapter2().getChapterTitle());
        System.out.println("Book Chapter 2 Text: " + book1.getChapter2().getChapterText());



        chapter1 = new Chapter("Глава 1 Название", "Глава 1 Текст");
        chapter2 = new Chapter("Глава 2 Название", "Глава 2 Текст");
        Book book2 = new Book("Name2", "Author2", 2005, chapter1, chapter2);

        System.out.println("Book name: " + book2.getName());
        System.out.println("Book author: " + book2.getAuthor());
        System.out.println("Book Release Year: " + book2.getReleaseYear());
        System.out.println("Book Chapter 1 Title: " + book2.getChapter1().getChapterTitle());
        System.out.println("Book Chapter 1 Text: " + book2.getChapter1().getChapterText());
        System.out.println("Book Chapter 2 Title: " + book2.getChapter2().getChapterTitle());
        System.out.println("Book Chapter 2 Text: " + book2.getChapter2().getChapterText());






    }
}
