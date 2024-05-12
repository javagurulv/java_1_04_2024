package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_6;

class SchoolReport {

    private String studentName;
    private int studentGrade;
    private int mathScore;
    private int englishScore;
    private int sportScore;
    private int artScore;
    private int geographyScore;

    public SchoolReport(String studentName, int studentGrade, int mathScore, int englishScore, int sportScore, int artScore, int geographyScore) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.sportScore = sportScore;
        this.artScore = artScore;
        this.geographyScore = geographyScore;

    }

    double averageScore(SchoolReport schoolReport) {

        return (double) (schoolReport.mathScore + schoolReport.englishScore + schoolReport.sportScore + schoolReport.artScore + schoolReport.geographyScore) / 5;

    }

    String getStudentName() {
        return this.studentName;

    }

    int getStudentGrade() {
        return this.studentGrade;

    }

}

class SchoolReportDemo {

    public static void main(String[] args) {

        SchoolReport schoolReport = new SchoolReport("Vasya Pupkin", 7, 9, 6, 7, 3, 10);
        SchoolReport schoolReport1 = new SchoolReport("John Doe", 9, 9, 8, 10, 6, 10);

        System.out.println("Name of the Student: " + schoolReport.getStudentName());
        System.out.println("Grade of the Student: " + schoolReport.getStudentGrade());
        System.out.println("Average Score: " + schoolReport.averageScore(schoolReport));

        System.out.println("Name of the Student: " + schoolReport1.getStudentName());
        System.out.println("Grade of the Student: " + schoolReport1.getStudentGrade());
        System.out.println("Average Score: " + schoolReport1.averageScore(schoolReport1));

    }

}
