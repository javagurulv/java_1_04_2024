package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_6_middle;



class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();

        test.salaryTaxTest0();
        test.salaryTaxTest9k();
        test.salaryTaxTest10k();
        test.salaryTaxTest49k();
        test.salaryTaxTest50k();
        test.salaryTaxTest100k();
    }
//    Test case:
//    1. 0
//    2. 9000
//    3. 10000
//    4. 49000
//    5. 50000
//    6. 100000

    public void salaryTaxTest0() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(0);
        checkResult(result, 0,"salaryTaxTest0");
    }
    public void salaryTaxTest9k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(9000);
        checkResult(result, 2700,"salaryTaxTest9k");
    }
    public void salaryTaxTest10k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(10000);
        checkResult(result, 3000,"salaryTaxTest10");
    }
    public void salaryTaxTest49k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(49000);
        checkResult(result, 18600,"salaryTaxTest49k");
    }
    public void salaryTaxTest50k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(50000);
        checkResult(result, 19000,"salaryTaxTest50k");
    }
    public void salaryTaxTest100k() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(100000);
        checkResult(result, 44000,"salaryTaxTest100k");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
