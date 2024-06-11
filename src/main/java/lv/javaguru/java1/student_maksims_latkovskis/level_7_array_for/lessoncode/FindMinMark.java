package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class FindMinMark {


    int minMark(int[] studentsMarks){
        int minMark = studentsMarks[0];
        for(int i=0; i<studentsMarks.length; i++){
            if(studentsMarks[i]<minMark) minMark = studentsMarks[i];
        }
        return minMark;
    }

}
