package lv.javaguru.java1.student_nadezda_radigina.lesson3.level3;

 class BookApplication {
     public static void main(String[] args){
         Chapter chapterOne = new Chapter("Chapter1","text1");
         Chapter chapterTwo = new Chapter("Chapter2","text2");
         Chapter chapterThree = new Chapter("Chapter3","text3");
         Chapter chapterFour = new Chapter("Chapter4","text4");
         Book book1 = new Book("Book1","Author1", 1990, chapterOne, chapterTwo);
         Book book2 = new Book("Book2","Author2", 2000, chapterThree, chapterFour);

         System.out.println("Book name: " + book1.getName());
         System.out.println("Book author: " + book1.getAuthor());
         System.out.println("Book year of publication: " + book1.getPublication());
         System.out.println("Book chapter1: " + book1.chapter1.getName() + "," + book1.chapter1.getText());
         System.out.println("Book chapter2: " + book1.chapter2.getName() + "," + book1.chapter2.getText());
         System.out.println();

         System.out.println("Book name: " + book2.getName());
         System.out.println("Book author: " + book2.getAuthor());
         System.out.println("Book year of publication: " + book2.getPublication());
         System.out.println("Book chapter1: " + book2.chapter1.getName() + "," + book2.chapter1.getText());
         System.out.println("Book chapter2: " + book2.chapter2.getName() + "," + book2.chapter2.getText());



     }

}
