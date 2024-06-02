package lv.javaguru.java1.student_anton_pereloma.lesson_7.lessoncode;

import java.lang.reflect.Array;

public class MaxGradesApps {
    public static void main(String[] args) {

        MaxGrade maxGrade = new MaxGrade();
        int [] array = {1,4,5,2,9};


        int highestGrade = maxGrade.findMaxGrade(array);
        System.out.println(highestGrade);
    }
}
