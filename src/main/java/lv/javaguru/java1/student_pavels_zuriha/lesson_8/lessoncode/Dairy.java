package lv.javaguru.java1.student_pavels_zuriha.lesson_8.lessoncode;

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
