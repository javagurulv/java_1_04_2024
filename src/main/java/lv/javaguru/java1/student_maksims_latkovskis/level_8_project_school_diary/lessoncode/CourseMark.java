package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.lessoncode;

class CourseMark {

    private String courseName;
    private int mark;

    CourseMark(String courseName, int mark){
        this.courseName = courseName;
        this.mark = mark;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMark() {
        return mark;
    }
}
