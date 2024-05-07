package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

public class StudentGrade {

 public String calculatedMark(int mark) {

     if (mark > 89) {
   return "A";
  }
  else if (mark > 79) {
   return "B";
  }
  else if (mark > 69) {
   return "C";
  } else if (mark > 59) {
   return "D";
  } else {
   return "F";
  }

 }


}
