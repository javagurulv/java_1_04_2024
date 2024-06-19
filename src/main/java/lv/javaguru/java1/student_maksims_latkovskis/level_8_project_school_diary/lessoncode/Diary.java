package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.lessoncode;

import java.util.ArrayList;
import java.util.List;

class Diary {

    private List<CourseMark> courseMarks;
    public Diary(){
        this.courseMarks = new ArrayList<>();
    }

    public  List<CourseMark> getMarks(){
        return courseMarks;
    }



    public void addMark(CourseMark courseMark){
        this.courseMarks.add(courseMark);
    }


}
