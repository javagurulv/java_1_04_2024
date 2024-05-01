package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_3;

class BookApp {

    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Chapter1", "Text1");
        Chapter chapter2 = new Chapter("Chapter2", "Text2");
        Book book1 = new Book("The hobbit", "Tolkien", 1937,
                chapter1, chapter2);

        Chapter chapter3 = new Chapter("Chapter3", "Text3");
        Chapter chapter4 = new Chapter("Chapter4", "Text4");
        Book book2 = new Book("1984", "Orwell", 1984,
                chapter3, chapter4);

        System.out.println("Book's 1 title is " + book1.getName());
        System.out.println("Book's 1 author is " + book1.getAuthor());
        System.out.println("Book's 1 year of publication is " + book1.getYear());
        System.out.println("Title of the first chapter is " + book1.getChapter1().getTitle());
        System.out.println("Text of the first chapter is " + book1.getChapter1().getText());
        System.out.println("Title of the second chapter is " + book1.getChapter2().getTitle());
        System.out.println("Text of the second chapter is " + book1.getChapter2().getText());

        System.out.println("Book's 2 title is " + book2.getName());
        System.out.println("Book's 2 author is " + book2.getAuthor());
        System.out.println("Book's 2 year of publication is " + book2.getYear());
        System.out.println("Title of the first chapter is " + book2.getChapter1().getTitle());
        System.out.println("Text of the first chapter is " + book2.getChapter1().getText());
        System.out.println("Title of the second chapter is " + book2.getChapter2().getTitle());
        System.out.println("Text of the second chapter is " + book2.getChapter2().getText());

    }
}
