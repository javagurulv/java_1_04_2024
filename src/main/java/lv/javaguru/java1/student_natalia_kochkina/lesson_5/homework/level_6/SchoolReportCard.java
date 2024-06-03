package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class SchoolReportCard {

    private String studentName;
    private String studentSurname;
    private int mathGrade;
    private int historyGrade;
    private int biologyGrade;
    private int englishGrade;
    private int sportGrade;

    SchoolReportCard(String studentName, String studentSurname, int mathGrade,
                            int historyGrade, int biologyGrade, int englishGrade, int sportGrade) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
        this.englishGrade = englishGrade;
        this.sportGrade = sportGrade;
    }

    String getStudentName() {
        return studentName;
    }

    String getStudentSurname() {
        return studentSurname;
    }

    int getMathGrade() {
        return mathGrade;
    }

    int getHistoryGrade() {
        return historyGrade;
    }

    int getBiologyGrade() {
        return biologyGrade;
    }

    int getEnglishGrade() {
        return englishGrade;
    }

    int getSportGrade() {
        return sportGrade;
    }
}
