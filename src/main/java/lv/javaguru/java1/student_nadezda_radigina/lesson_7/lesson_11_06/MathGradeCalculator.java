package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

 class MathGradeCalculator {
     int findMaxGrade(int[] grades) {
         int maxGrade = grades[0];
         for (int i = 0; i < grades.length; i++){
           if (maxGrade < grades[i]){
               maxGrade = grades[i];
           }
         }
         return maxGrade;
     }
}
