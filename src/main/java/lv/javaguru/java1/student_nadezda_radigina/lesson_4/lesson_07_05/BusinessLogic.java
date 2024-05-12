package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class BusinessLogic {

        public String calculateGrade(int mark){


            if ((mark >= 90) && (mark <= 100)){
                return "A";
            } else if ((mark >= 80) && (mark <= 89)){
                return "B";
            } else if ((mark >= 70) && (mark <= 79)){
                return "C";
            } else if ((mark >= 60) && (mark <= 69)){
                return "D";
            } else if ((mark >= 50) && (mark <= 59)){
                return "D";
            } else if ((mark >= 0) && (mark <= 49)){
                return "E";
            } else {
                return "Unknown mark";
            }

        }
    }

