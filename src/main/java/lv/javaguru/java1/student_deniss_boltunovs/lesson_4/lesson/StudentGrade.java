package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.lesson;

class StudentGrade {

     public StudentGrade() {}

     public String calculateGrade(int number) {

         String grade ;

         if ((number >= 90) && (number <= 100)) {
             grade = "A" ;
         } else if ((number >= 80) && (number <= 89)) {
             grade = "B";
         } else if ((number >= 70) && (number <= 79)) {
             grade = "C";
         } else if ((number >= 60) && (number <= 69)) {
             grade = "D";
         } else {
             grade = "F";
         }

         return grade;
     }

}
