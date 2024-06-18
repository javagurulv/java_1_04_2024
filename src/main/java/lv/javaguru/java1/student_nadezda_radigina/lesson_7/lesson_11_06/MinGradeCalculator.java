package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

 class MinGradeCalculator {
     int findMinGrade(int[] grades) {
         int minGrade = grades[0];
         for (int i = 0; i < grades.length; i++){
             if (minGrade > grades[i]){
                 minGrade = grades[i];
             }
         }
         return minGrade;
     }
 }

