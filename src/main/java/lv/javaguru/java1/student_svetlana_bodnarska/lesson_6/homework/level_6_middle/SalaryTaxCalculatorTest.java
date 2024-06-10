package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_6_middle;

class SalaryTaxCalculatorTest {

    // 1. 0 -> 0
    // 2. 9000 -> 2700
    // 3. 10000 -> 3000
    // 4. 15000 -> 5000
    // 5. 50000 -> 19000
    // 6. 60000 -> 24000
    // 7. 60000.10 -> 24000.05

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }

    public void test1() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(0);
        checkResult(realResult, 0, "1");
    }
    public void test2() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(9000);
        checkResult(realResult, 2700, "2");
    }
    public void test3() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(10000);
        checkResult(realResult, 3000, "3");
    }
    public void test4() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(15000);
        checkResult(realResult, 5000, "4");
    }
    public void test5() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(50000);
        checkResult(realResult, 19000, "5");

    }
    public void test6() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(60000);
        checkResult(realResult, 24000, "6");

    }
    public void test7() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(60000.10);
        checkResult(realResult, 24000.05, "7");
    }
    public void checkResult (double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("TEST " + testName + " OK");
        } else {
            System.out.println("TEST " + testName + " FAIL");

        }
    }
}
