package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class SchoolReportCardApp {

    public static void main(String[] args) {

        AverageGradeCalculator averageGradeCalculator = new AverageGradeCalculator();
        SchoolReportCard schoolReportCard1 = new SchoolReportCard("Chuck", "Norris",
                2, 1, 5, 5, 10);
        SchoolReportCard schoolReportCard2 = new SchoolReportCard("Sponge", "Bob",
                10, 10, 10, 10, 10);

        System.out.println(averageGradeCalculator.calculateAverage(schoolReportCard1));
        System.out.println(averageGradeCalculator.calculateAverage(schoolReportCard2));
    }
}
