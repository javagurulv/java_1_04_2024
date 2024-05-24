package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_6_middle;

import java.util.Scanner;

class StudentGradesApp {

     public static void main(String[] args){

         StudentGrades studentGrades = new StudentGrades();
         double averageResult = studentGrades.averageGrade(8, 7,9,7,6);
         double averageResult1 = studentGrades.averageGrade(5, 9,6,7,8);
         double averageResult3 = studentGrades.averageGrade(8, 9,6,5,3);

         System.out.println("Average grade is = " + averageResult);
         System.out.println("Average grade is = " + averageResult1);
         System.out.println("Average grade is = " + averageResult3);

     }
}
