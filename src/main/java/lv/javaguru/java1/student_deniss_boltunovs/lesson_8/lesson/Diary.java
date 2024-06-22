package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.lesson;

import java.util.ArrayList;
import java.util.List;

class Diary {

    private List<Mark> marks;

    Diary() {this.marks = new ArrayList<>();}

    List<Mark> getMarks(){
        return marks;
    }

    void addMark(Mark mark){
        marks.add(mark);
    }

    @Override
    public String toString() {
        return "Diary{" + "marks=" + marks + '}';
    }

}
