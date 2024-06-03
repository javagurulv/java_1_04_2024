package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_6;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.percentThirty();
        test.percentForty();
        test.percentFifty();
        test.percentZero();
        test.underZero();

    }

    public void percentThirty() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(5000);
        checkResult(realResult, 1500, "Test for Tax under 10k");

    }

    public void percentForty() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(30000);
        checkResult(realResult, 11000, "Test for Tax 10k - 50k");

    }

    public void percentFifty() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(55000);
        checkResult(realResult, 21500, "Test for Tax upper 50k");

    }

    public void percentZero() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(0);
        checkResult(realResult, 0, "Test for Tax Zero");

    }

    public void underZero() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(-10);
        checkResult(realResult, 0, "Test for Tax Zero");

    }

    private void checkResult(double realResult, double expectedResult, String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": OK");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }


    }
}
