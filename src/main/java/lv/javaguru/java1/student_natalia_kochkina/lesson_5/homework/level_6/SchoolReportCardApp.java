package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class SchoolReportCardApp {

    public static void main(String[] args) {

        AverageGradeCalculator calculator = new AverageGradeCalculator();

        SchoolReportCard card1 = new SchoolReportCard("Chuck", "Norris",
                2, 1, 5, 5, 10);
        SchoolReportCard card2 = new SchoolReportCard("Sponge", "Bob",
                10, 10, 10, 10, 10);

        System.out.println(calculator.calculateAverage(card1));
        System.out.println(calculator.calculateAverage(card2));
    }
}
