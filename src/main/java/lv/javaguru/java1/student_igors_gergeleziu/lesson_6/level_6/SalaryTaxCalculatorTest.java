package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_6;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    void test1() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double actualResult = salaryTaxCalculator.calculate(0);
        checkResult(actualResult, 0, "ZeroSalaryTest1");
    }

    void test2() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double actualResult = salaryTaxCalculator.calculate(8000);
        checkResult(actualResult, 2400, "ThirtyPercentTaxTest2");
    }

    void test3() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double actualResult = salaryTaxCalculator.calculate(40000);
        checkResult(actualResult, 15000, "FortyPercentTaxTest3");
    }

    void test4() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double actualResult = salaryTaxCalculator.calculate(60000);
        checkResult(actualResult, 24000, "FiftyPercentTaxTest4");
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
