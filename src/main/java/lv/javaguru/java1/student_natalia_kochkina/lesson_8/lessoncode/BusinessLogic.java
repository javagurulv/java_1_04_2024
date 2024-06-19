package lv.javaguru.java1.student_natalia_kochkina.lesson_8.lessoncode;

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

    // find best mark for subject
    public int findBestMarkBySubject(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int bestMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() > bestMark) {
                bestMark = mark.getMark();
            }
        }
        return bestMark;
    }

    // find worst mark for subject
    public int findWorstMarkBySubject(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int worstMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() < worstMark) {
                worstMark = mark.getMark();
            }
        }
        return worstMark;
    }

    // find average mark for subject
    public double findAverageMarkBySubject(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        return (double) findMarksSum(subjectMarks)
                / subjectMarks.size();
    }

    // find average mark for subject
    public double findAverageMarkByAllSubjects() {
        return (double) findMarksSum(dairy.getMarks())
                / dairy.getMarks().size();
    }

    // find all marks by subject
    private List<Mark> findMarksBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : dairy.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    private int findMarksSum(List<Mark> marks) {
        return marks.stream()
                .map(Mark::getMark)
                .reduce(Integer::sum).orElse(0);
    }

}
