package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class MaxMarkFinder {

   int findMaxMark(int[] marks) {
       int maxMark = marks[0] ;
       int i = 0;
       while (i < marks.length) {
           if (marks[i] > maxMark) {
               maxMark = marks[i];
           }
           i++;
       }
       return maxMark;
   }

}
