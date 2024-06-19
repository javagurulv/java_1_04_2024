package lv.javaguru.java1.teacher.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class BusinessLogic {

    private Dairy dairy;

    public BusinessLogic() {
        this.dairy = new Dairy();
    }

    public void addMark(String subject, int mark) {
        Mark newMark = new Mark(subject, mark);
        dairy.addMark(newMark);
    }

    // find all marks by subject
    public List<Mark> findMarksBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();

/*
        List<Mark> allMarks = dairy.getMarks();
        for (int i = 0; i < allMarks.size(); i++) {
            Mark mark = allMarks.get(i);
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
*/

        for (Mark mark : dairy.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    // find best mark for subject
    public int findBestMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int bestMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() > bestMark) {
                bestMark = mark.getMark();
            }
        }
        return bestMark;
    }

}
