package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_6;

class SalaryTaxCalculatorAppTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorAppTest test = new SalaryTaxCalculatorAppTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(8000);
        checkResult(realResult, 2400, "30% tax test ");
    }

    public void test2() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(30000);
        checkResult(realResult, 11000, "40% tax test ");
    }

    public void test3() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(60000);
        checkResult(realResult, 24000, "50% tax test ");
    }

    public void test4() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(-5000);
        checkResult(realResult, 0, "0% tax test ");
    }

    private void checkResult(double realResult, double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }
}
