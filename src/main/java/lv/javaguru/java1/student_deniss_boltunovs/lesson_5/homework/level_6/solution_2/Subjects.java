package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_6.solution_2;

class Subjects {
      private int math;
      private int english;
      private int economics;
      private int art;
      private int sport;

      public Subjects(int math, int english, int economics, int art, int sport) {
          this.math = math;
          this.english = english;
          this.economics = economics;
          this.art = art;
          this.sport = sport;
      }

     public int getMath(){return this.math;}

     public int getEnglish(){return this.english;}

     public int getEconomics(){return this.economics;}

     public int getArt(){return this.art;}

     public int getSport(){return this.sport;}

}
