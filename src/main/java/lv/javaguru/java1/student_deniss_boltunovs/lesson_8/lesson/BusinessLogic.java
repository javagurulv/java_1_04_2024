package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.lesson;

import java.util.ArrayList;
import java.util.List;

class BusinessLogic {

     private Diary diary;

     BusinessLogic(){
         this.diary = new Diary();
     }

     Diary getDiary(){
        return diary;
     }

     public void addNewMark(String subject, int mark) {
         Mark newMark = new Mark(subject,mark);
         diary.addMark(newMark);
     }

     List<Mark> marksForSubject(String subject) {
         List<Mark> subjectMarks = new ArrayList<>();

         /// adding marks for selected subject to new list
         for (Mark mark : diary.getMarks()){
             if (mark.getSubject().equals(subject)){
                 subjectMarks.add(mark);
             }
         }
         return subjectMarks;
     }

     int findBestMark(String subject){
         List<Mark> marks = marksForSubject(subject);
         int maxMark = 0;
         for (Mark mark : marks) {
             if (mark.getMark() > maxMark) {
                 maxMark = mark.getMark();
             }
         }
         return maxMark;
     }

}
