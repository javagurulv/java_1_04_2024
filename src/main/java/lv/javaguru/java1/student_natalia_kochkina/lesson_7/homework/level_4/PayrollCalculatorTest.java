package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

import java.math.BigDecimal;

class PayrollCalculatorTest {

    public static void main(String[] args) {
        PayrollCalculatorTest test = new PayrollCalculatorTest();
        test.salarySumTest1();
        test.salarySumTest2();
        test.minSalaryTest1();
        test.minSalaryTest2();
        test.minSalaryTest3();
        test.maxSalaryTest1();
        test.maxSalaryTest2();
        test.maxSalaryTest3();
        test.averageSalaryTest1();
        test.averageSalaryTest2();
        test.sigmaSalaryTest1();
        test.sigmaSalaryTest2();
        test.sigmaSalaryTest3();

    }

    //sum, 1500, 2000, 1555 -> 5055
    public void salarySumTest1() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("1500"),
                new BigDecimal("2000"),
                new BigDecimal("1555")};
        BigDecimal realResult = calculator.calculateSalarySum(salaries);
        checkResults(realResult, new BigDecimal("5055"),
                "SalarySum1");
    }

    //sum, {} -> 0
    public void salarySumTest2() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {};
        BigDecimal realResult = calculator.calculateSalarySum(salaries);
        checkResults(realResult, BigDecimal.ZERO,
                "SalarySum2");
    }

    //min, 1500, 2000, 1555 -> 1500
    public void minSalaryTest1() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("1500"),
                new BigDecimal("2000"),
                new BigDecimal("1555")};
        BigDecimal realResult = calculator.calculateMinSalary(salaries);
        checkResults(realResult, new BigDecimal("1500"),
                "MinSalary1");
    }

    //min, 2300, 1000, 1500 -> 1000
    public void minSalaryTest2() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("2300"),
                new BigDecimal("1000"),
                new BigDecimal("1500")};
        BigDecimal realResult = calculator.calculateMinSalary(salaries);
        checkResults(realResult, new BigDecimal("1000"),
                "MinSalary2");
    }

    //{} -> 0
    public void minSalaryTest3() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {};
        BigDecimal realResult = calculator.calculateMinSalary(salaries);
        checkResults(realResult, BigDecimal.ZERO,
                "MinSalary3");
    }

    //max, 1500, 2000, 1555 -> 2000
    public void maxSalaryTest1() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("1500"),
                new BigDecimal("2000"),
                new BigDecimal("1555")};
        BigDecimal realResult = calculator.calculateMaxSalary(salaries);
        checkResults(realResult, new BigDecimal("2000"),
                "MaxSalary1");
    }

    //max, 2300, 1000, 1500 -> 2300
    public void maxSalaryTest2() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("2300"),
                new BigDecimal("1000"),
                new BigDecimal("1500")};
        BigDecimal realResult = calculator.calculateMaxSalary(salaries);
        checkResults(realResult, new BigDecimal("2300"),
                "MaxSalary2");
    }

    //{} -> 0
    public void maxSalaryTest3() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {};
        BigDecimal realResult = calculator.calculateMaxSalary(salaries);
        checkResults(realResult, BigDecimal.ZERO,
                "MaxSalary3");
    }

    //average, 2300, 1000, 1500 -> 1600
    public void averageSalaryTest1() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("2300"),
                new BigDecimal("1000"),
                new BigDecimal("1500")};
        BigDecimal realResult = calculator.calculateAverageSalary(salaries);
        checkResults(realResult, new BigDecimal("1600"),
                "AverageSalary1");
    }

    //{} -> 0
    public void averageSalaryTest2() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {};
        BigDecimal realResult = calculator.calculateAverageSalary(salaries);
        checkResults(realResult, BigDecimal.ZERO,
                "AverageSalary2");
    }

    //sigma, 2300, 1000, 1500 -> 1600
    public void sigmaSalaryTest1() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("2300"),
                new BigDecimal("1000"),
                new BigDecimal("1500")};
        BigDecimal realResult = calculator.calculateSigma(salaries);
        checkResults(realResult, new BigDecimal("535.41"),
                "SigmaSalary1");
    }

    //sigma, 11500, 12000, 8900 ->
    public void sigmaSalaryTest2() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {new BigDecimal("11500"),
                new BigDecimal("12000"),
                new BigDecimal("8900")};
        BigDecimal realResult = calculator.calculateSigma(salaries);
        checkResults(realResult, new BigDecimal("1358.92"),
                "SigmaSalary2");
    }

    //{} -> 0
    public void sigmaSalaryTest3() {
        PayrollCalculator calculator = new PayrollCalculator();
        BigDecimal[] salaries = {};
        BigDecimal realResult = calculator.calculateSigma(salaries);
        checkResults(realResult, BigDecimal.ZERO,
                "SigmaSalary3");
    }

    private void checkResults(BigDecimal realResult, BigDecimal expectedResult,
                              String testName) {
        if ((expectedResult.compareTo(realResult)) == 0) {
            System.out.println("Test " + testName + " OK" );
        } else {
            System.out.println("Test " + testName + " FAIL");
        }
    }

}
