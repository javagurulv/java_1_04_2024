package lv.javaguru.java1.teacher.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class Dairy {

    private List<Mark> marks;

    public Dairy() {
        this.marks = new ArrayList<>();
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void addMark(Mark mark) {
        this.marks.add(mark);
    }

}
