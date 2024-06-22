package lv.javaguru.java1.student_pavels_zuriha.lesson_8.lessoncode;

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

    public List<Mark> findMarkBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : dairy.getMarks()) {
            if (mark.getSchoolSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    public int findBestMark(String subject) {
        List<Mark> subjectMarks = findMarkBySubject(subject);
        int bestMark = subjectMarks.get(0).getSubjectMark();
        for (Mark mark : subjectMarks) {
            if (mark.getSubjectMark() > bestMark) {
                bestMark = mark.getSubjectMark();
            }
        }
        return bestMark;
    }

    public int findWorstMark(String subject) {
        List<Mark> subjectMarks = findMarkBySubject(subject);
        int worstMark = subjectMarks.get(0).getSubjectMark();
        for (Mark mark : subjectMarks) {
            if (mark.getSubjectMark() < worstMark) {
                worstMark = mark.getSubjectMark();
            }
        }
        return worstMark;
    }

    public double findAverageMark(String subject) {
        List<Mark> subjectMarks = findMarkBySubject(subject);
        int sumMarks = 0;
        for (Mark mark : subjectMarks) {
            sumMarks = sumMarks + mark.getSubjectMark();
        }
        return (double) sumMarks / subjectMarks.size();
    }

}
