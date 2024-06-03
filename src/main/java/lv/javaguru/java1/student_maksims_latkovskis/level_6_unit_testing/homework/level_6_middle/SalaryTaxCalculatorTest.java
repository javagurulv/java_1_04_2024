package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_6_middle;

class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        // For 2000, the expected output is 600
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double taxes = salaryTaxCalculator.calculate(2000);
        testResult("600.0", Double.toString(taxes), "Test 1");
    }

    public void test2() {
        // For 11333.3, the expected output is 4533.32
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double taxes = salaryTaxCalculator.calculate(11333.3);
        testResult("3533.32", String.format("%.2f", taxes), "Test 2");
    }

    public void test3() {
        // For -5, the expected output is 0
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double taxes = salaryTaxCalculator.calculate(-5);
        testResult("0.0", Double.toString(taxes), "Test 3");
    }

    public void test4() {
        // For 78229, the expected output is 39114.5
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double taxes = salaryTaxCalculator.calculate(78229);
        testResult("33114.5", Double.toString(taxes), "Test 4");
    }

    public void testResult(String expectedOutput, String gainedOutput, String testName) {
        if (expectedOutput.equalsIgnoreCase(gainedOutput)) {
            System.out.println("PASS " + testName);
        } else {
            System.out.println("FAIL " + testName);
            System.out.println("The gained output is: " + gainedOutput);
        }
    }
}
