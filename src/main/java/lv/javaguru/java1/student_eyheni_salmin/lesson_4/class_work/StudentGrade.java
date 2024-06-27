package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

class StudentGrade {

    public String calculateGrade(int mark) {
        if ((mark <= 100) && (mark >= 90)) return "A";
        else if ((mark <= 89) && (mark >= 80)) return "B";
        else if ((mark <= 79) && (mark >= 70)) return "C";
        else if ((mark <= 69) && (mark >= 60)) return "D";
        else if ((mark <= 59) && (mark >= 0)) return "F";
        else return "unknown grade";
    }



}
