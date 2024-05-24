package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_6_middle;

class CalculateGradeAverage {
    private ReportCard gradeAverage;
    CalculateGradeAverage(ReportCard gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    double findGradeAverage() {
        double allGradeSum =
                gradeAverage.getMathFinalGrade() + gradeAverage.getLatvianFinalGrade() +
                gradeAverage.getEnglishFinalGrade() + gradeAverage.getScienceFinalGrade();
        return allGradeSum/4;
    }


}