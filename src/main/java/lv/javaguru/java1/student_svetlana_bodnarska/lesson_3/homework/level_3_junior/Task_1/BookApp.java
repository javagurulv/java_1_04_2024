package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_3_junior.Task_1;

class BookApp {

    public static void main(String[] args) {

        Book book1 = new Book("Magnolia", "John Kierby", 2022, "Tree of Life", "Blooming");
        Book book2 = new Book("First Class","B. Kennedy", 1993, "New Road", "My Class");

        System.out.println("Name: " + book1.getName());
        System.out.println("Author: " +book1.getAuthor());
        System.out.println("Year Of Publishing: " + book1.getYearOfPublishing());
        System.out.println("Chapter1: " +book1.getChapter1());
        System.out.println("Chapter2: " + book1.getChapter2());

        System.out.println("Name: " + book2.getName());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year Of Publishing: " + book2.getYearOfPublishing());
        System.out.println("Chapter1: " + book2.getChapter1());
        System.out.println("Chapter2: " + book2.getChapter2());

        Chapter chapter1 = new Chapter("Introduction: ", "Happy Holidays for everyone");
        Chapter chapter2 = new Chapter("My road", "How to get the right road?");

        System.out.println("Name: " + chapter1.getName());
        System.out.println("Text: " + chapter1.getText());
        System.out.println("Name: " + chapter2.getName());
        System.out.println("Text: " + chapter2.getText());





    }

}
