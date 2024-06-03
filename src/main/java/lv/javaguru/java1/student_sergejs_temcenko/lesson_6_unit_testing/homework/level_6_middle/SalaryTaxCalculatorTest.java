package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_6_middle;


class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    // 1. 2000 expected tax 600
    public void test1() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(2000);
        testCheck(result, 600, "Test1:");
    }

    // 1. 50000 expected tax 19000
    public void test2() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(50000);
        testCheck(result, 19000, "Test2:");
    }

    // 1. 60000 expected tax 24000
    public void test3() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(60000);
        testCheck(result, 24000, "Test3:");
    }

    //1. 0; expected o
    public void test4() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(0);
        testCheck(result, 0, "Test4:");
    }

    private void testCheck(double result,
                           double expected,
                           String testName) {
        if (result == expected) {
            System.out.println(testName + " OK " + result);
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
