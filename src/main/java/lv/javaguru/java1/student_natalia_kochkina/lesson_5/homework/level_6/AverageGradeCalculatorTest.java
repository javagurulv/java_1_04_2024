package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_6;

class AverageGradeCalculatorTest {

    public static void main(String[] args) {
        AverageGradeCalculatorTest test = new AverageGradeCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
    }

    //5, 2, 3, 5, 5 -> 4
    public void test1() {
        SchoolReportCard card = new SchoolReportCard("Chuck",
                "Norris", 5, 2,
                3, 5, 5);
        AverageGradeCalculator calculator = new AverageGradeCalculator();
        double realResult = calculator.calculateAverage(card);
        checkResult(realResult, 4, "test1 ");
    }

    //0, 0, 0, 0, 0 -> 0
    public void test2() {
        SchoolReportCard card = new SchoolReportCard("Chuck",
                "Norris", 0, 0,
                0, 0, 0);
        AverageGradeCalculator calculator = new AverageGradeCalculator();
        double realResult = calculator.calculateAverage(card);
        checkResult(realResult, 0, "test2 ");
    }

    //5, 6, 2, 3, 1 -> 3.4
    public void test3() {
        SchoolReportCard card = new SchoolReportCard("Chuck",
                "Norris", 5, 6,
                2, 3, 1);
        AverageGradeCalculator calculator = new AverageGradeCalculator();
        double realResult = calculator.calculateAverage(card);
        checkResult(realResult, 3.4, "test3 ");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
