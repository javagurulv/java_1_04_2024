package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_6_middle;

class ReportCard {
    private String firstName;
    private String lastName;

    private int mathFinalGrade;
    private int latvianFinalGrade;
    private int englishFinalGrade;
    private int scienceFinalGrade;

    ReportCard(String firstName, String lastName,
               int latvianFinalGrade,int englishFinalGrade,
               int mathFinalGrade, int scienceFinalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mathFinalGrade = mathFinalGrade;
        this.latvianFinalGrade = latvianFinalGrade;
        this.englishFinalGrade = englishFinalGrade;
        this.scienceFinalGrade = scienceFinalGrade;
    }

    String getFullName() { return firstName + " " + lastName; }
    double getMathFinalGrade() { return mathFinalGrade; }
    double getLatvianFinalGrade() { return latvianFinalGrade; }
    double getEnglishFinalGrade() { return englishFinalGrade; }
    double getScienceFinalGrade() { return scienceFinalGrade; }


}
