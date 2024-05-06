package lv.javaguru.java1.student_nadezda_radigina.lesson3.level3;

 class Book {
     String name;
     String author;
     int publication;
     Chapter chapter1;
     Chapter chapter2;
     public Book(String name, String author, int publication, Chapter chapter1, Chapter chapter2){
         this.name =name;
         this.author = author;
         this.publication = publication;
         this.chapter1 = chapter1;
         this.chapter2 = chapter2;

     }
     public String getName(){
         return this.name = name;
     }
     public String getAuthor(){
         return this.author = author;
     }
     public int getPublication(){
         return this.publication = publication;
     }




}
