package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class SchoolReportCard {

    private String studentName;
    private String studentSurname;
    private int mathGrade;
    private int historyGrade;
    private int biologyGrade;
    private int englishGrade;
    private int sportGrade;

    public SchoolReportCard(String studentName, String studentSurname, int mathGrade,
                            int historyGrade, int biologyGrade, int englishGrade, int sportGrade) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
        this.englishGrade = englishGrade;
        this.sportGrade = sportGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getSportGrade() {
        return sportGrade;
    }
}
