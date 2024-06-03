package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class AverageGradeCalculator {

    double calculateAverage(SchoolReportCard card) {
        return (card.getMathGrade() + card.getSportGrade() +
                card.getBiologyGrade() + card.getEnglishGrade()
                + card.getHistoryGrade()) / (double) 5;
    }
}
