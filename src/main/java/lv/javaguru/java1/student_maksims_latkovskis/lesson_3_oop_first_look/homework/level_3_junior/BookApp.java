package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_3_junior;

class BookApp {

    public static void main(String[] args){

        Chapter book1Chapter1 = new Chapter("First Meeting", "Once upon a time...");
        Chapter book1Chapter2 = new Chapter("On march", "Our regiment had...");
        Book book1 = new Book("War and Peace", "N.Tolstoy", 1884,book1Chapter1,book1Chapter2);

        Chapter book2Chapter1 = new Chapter("Penniless student", "Raskolnikoff was a type...");
        Chapter book2Chapter2 = new Chapter("Kind offer", "Wandering on the streets...");
        Book book2 = new Book("Crime and Punishment", "F.Dostoyevsky", 1887,book2Chapter1,book2Chapter2);


        System.out.println("Author of first book is: " + book1.getAuthor());
        System.out.println("Title of second book is: " + book2.getTitle());
        System.out.println("Year of publishing the first book is : " + book1.getYearPublished());

        System.out.println("The title of the first book first chapter is: " + book1.getChapter1().getChapterTitle());
        System.out.println("The content of the second book second chapter is: " + book2.getChapter2().getChapterContent());
    }

}
