package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_6_middle;

class ReportCard {

    private String[] subject;
    private int[] grades;

    public ReportCard(String[] subject, int[] grades) {
        if (subject.length != grades.length) {
            throw new IllegalArgumentException("subjects = grades");
        }
        this.subject = subject;
        this.grades = grades;
    }

    public String[] getSubject() {
        return subject;
    }

    public int[] getGrades() {
        return grades;
    }
}
