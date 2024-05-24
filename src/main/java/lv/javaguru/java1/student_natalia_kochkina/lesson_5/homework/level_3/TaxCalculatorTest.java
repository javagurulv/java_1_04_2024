package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_3;

import java.math.BigDecimal;

class TaxCalculatorTest {

    public static void main(String[] args) {
        TaxCalculatorTest test = new TaxCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    //5555 -> 1666.5
    public void test1() {
        TaxCalculator calculator = new TaxCalculator();
        BigDecimal realResult = calculator.calculateTax(new BigDecimal("5555"));
        checkResult(realResult, new BigDecimal("1666.5"),
                "test1 ");
    }

    //16000 -> 5400
    public void test2() {
        TaxCalculator calculator = new TaxCalculator();
        BigDecimal realResult = calculator.calculateTax(new BigDecimal("16000"));
        checkResult(realResult, new BigDecimal("5400"),
                "test2 ");
    }

    //66587 -> 27293.5
    public void test3() {
        TaxCalculator calculator = new TaxCalculator();
        BigDecimal realResult = calculator.calculateTax(new BigDecimal("66587"));
        checkResult(realResult, new BigDecimal("27293.5"),
                "test3 ");
    }

    //0 -> 0
    public void test4() {
        TaxCalculator calculator = new TaxCalculator();
        BigDecimal realResult = calculator.calculateTax(BigDecimal.ZERO);
        checkResult(realResult, new BigDecimal("0"),
                "test4 ");
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
