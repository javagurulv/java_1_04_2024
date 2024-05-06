package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_3;

class Book {

      private String title;
      private String author;
      private int publishingYear;
      Chapter chapter1;
      Chapter chapter2;

      public Book(String title, String author, int publishingYear,
                  Chapter chapter1, Chapter chapter2) {

          this.title = title;
          this.author = author;
          this.publishingYear = publishingYear;
          this.chapter1 = chapter1;
          this.chapter2 = chapter2;
      }

      public String getTitle() {return this.title;}

      public String getAuthor() {return this.author;}

      public int getPublishingYear() {return this.publishingYear;}

      public Chapter getChapter1() {return this.chapter1;}

      public Chapter getChapter2() {return this.chapter2;}

}
