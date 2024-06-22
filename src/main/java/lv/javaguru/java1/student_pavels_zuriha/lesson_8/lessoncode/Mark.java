package lv.javaguru.java1.student_pavels_zuriha.lesson_8.lessoncode;

class Mark {

    private String schoolSubject;
    private int subjectMark;

    public Mark(String schoolSubject, int subjectMark) {
        this.subjectMark = subjectMark;
        this.schoolSubject = schoolSubject;

    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public int getSubjectMark() {
        return subjectMark;
    }
}
