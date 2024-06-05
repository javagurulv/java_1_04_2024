package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class AvgMarkFinder {

   double findAvgMark(int[] marks) {
       int countOfMarks = marks.length;
       return (double) sumOfMarks(marks) / countOfMarks;
   }

   private int sumOfMarks(int[] marks) {
       int sum = 0;
       for (int mark : marks) {sum += mark;}
       return sum;
   }

}
