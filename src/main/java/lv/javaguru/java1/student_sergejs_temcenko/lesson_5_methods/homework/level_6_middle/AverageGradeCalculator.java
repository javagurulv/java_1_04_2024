package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_6_middle;

class AverageGradeCalculator {

    double calculateAverageGrade(ReportCard reportCard) {
        int[] grades = reportCard.getGrades();
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Not good: ");
        }

        double total = 0;
        for (int grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }


}
