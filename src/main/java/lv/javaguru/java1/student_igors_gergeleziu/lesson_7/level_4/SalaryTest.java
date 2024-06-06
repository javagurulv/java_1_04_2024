package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_4;

class SalaryTest {
    public static void main(String[] args) {
        SalaryTest test = new SalaryTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

    double[] createTestArray() {
        double[] array = {2000.0, 1200.0, 1400.0, 1800.0, 1100.0, 1500.0};
        return array;
    }

    void test1() {
        Salary salary = new Salary();
        double actualResult = salary.calculateTotalSalary(createTestArray());
        checkResult(actualResult, 9000.0, "CalculateTotalSalaryTest1");
    }

    void test2() {
        Salary salary = new Salary();
        double actualResult = salary.calculateAverageSalary(createTestArray());
        checkResult(actualResult, 1500.0, "CalculateAverageSalaryTest2");
    }

    void test3() {
        Salary salary = new Salary();
        double actualResult = salary.findMaxSalary(createTestArray());
        checkResult(actualResult, 2000.0, "FindMaxSalaryTest3");
    }

    void test4() {
        Salary salary = new Salary();
        double actualResult = salary.findMinSalary(createTestArray());
        checkResult(actualResult, 1100.0, "FindMinSalaryTest4");
    }

    void test5() {
        Salary salary = new Salary();
        double actualResult = salary.calculateStandardDeviation(createTestArray());
        checkResult(valueFormattingWithMathRound(actualResult, 2), 316.23, "calculateStandardDeviationTest5");
    }

    static double valueFormattingWithMathRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
