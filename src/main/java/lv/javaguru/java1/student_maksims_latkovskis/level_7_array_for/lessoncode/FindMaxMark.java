package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class FindMaxMark {

    int maxMark(int[] studentsMarks){
        int maxMark = 0;
        for(int i=0; i<studentsMarks.length; i++){
            if(studentsMarks[i]>maxMark) maxMark = studentsMarks[i];
        }
        return maxMark;
    }


}
