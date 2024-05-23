package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_6_middle;

class AverageGradeCalculatorApplcation {

    public static void main(String[] args) {

        String[] subject = {"Математика", "Физика", "Химия", "Литература", "История"};
        int[] grades = {4, 4, 5, 2, 3};

        ReportCard reportCard = new ReportCard(subject, grades);

        AverageGradeCalculator averageGradeCalculator = new AverageGradeCalculator();

        double averageGrade = averageGradeCalculator.calculateAverageGrade(reportCard);

        System.out.println(averageGrade);
    }

}
