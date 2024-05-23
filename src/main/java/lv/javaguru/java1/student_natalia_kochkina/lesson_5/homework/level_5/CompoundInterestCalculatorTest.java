package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_5;

import java.math.BigDecimal;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

    //investment = 0, interestRate = 5, years = 10 -> 0

    public void test1() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        BigDecimal realResult = calculator.calculate(BigDecimal.ZERO,
                new BigDecimal("5"), 10);
        checkResult(realResult, BigDecimal.ZERO, "test1 ");
    }

    //investment = 10000, interestRate = 0, years = 10 -> 10000
    public void test2() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        BigDecimal realResult = calculator.calculate(new BigDecimal("10000"),
                BigDecimal.ZERO, 10);
        checkResult(realResult, new BigDecimal("10000"), "test2 ");
    }

    //investment = 10000, interestRate = 5, years = 0 -> 10000
    public void test3() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        BigDecimal realResult = calculator.calculate(new BigDecimal("10000"),
                new BigDecimal("5"), 0);
        checkResult(realResult, new BigDecimal("10000"), "test3 ");
    }

    //investment = 10000, interestRate = 5, years = 10 -> 16288.94
    public void test4() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        BigDecimal realResult = calculator.calculate(new BigDecimal("10000"),
                new BigDecimal("5"), 10);
        checkResult(realResult, new BigDecimal("16288.95"), "test4 ");
    }

    //investment = 15000, interestRate = 15, years = 5 -> 30170.36
    public void test5() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        BigDecimal realResult = calculator.calculate(new BigDecimal("15000"),
                new BigDecimal("15"), 5);
        checkResult(realResult, new BigDecimal("30170.36"), "test5 ");
    }

    private void checkResult(BigDecimal realResult,
                             BigDecimal expectedResult,
                             String testScenarioName) {
        if ((realResult.compareTo(expectedResult)) == 0) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
