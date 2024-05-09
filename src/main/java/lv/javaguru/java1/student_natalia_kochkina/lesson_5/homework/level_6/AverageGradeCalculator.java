package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class AverageGradeCalculator {

    public double calculateAverage(SchoolReportCard schoolReportCard) {
        double averageGrade = (schoolReportCard.getMathGrade() + schoolReportCard.getSportGrade() +
                schoolReportCard.getBiologyGrade() + schoolReportCard.getEnglishGrade()
                + schoolReportCard.getHistoryGrade()) / (double) 5;
        return averageGrade;
    }
}
