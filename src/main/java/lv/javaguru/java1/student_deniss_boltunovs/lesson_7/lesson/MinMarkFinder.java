package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class MinMarkFinder {

   int findMinMark(int[] marks) {
       int minMark = marks[0] ;
       int i = 0;
       while (i < marks.length) {
//         if (marks[i] < minMark) {minMark = marks[i];}
           minMark = Math.min(minMark, marks[i]);
           i++;
       }
       return minMark;
   }

}