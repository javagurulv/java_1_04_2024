package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_7;

class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    void test1() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = compoundInterestCalculator.compoundInterest(0, 10, 2);
        checkResult(actualResult, 0, "sumZeroTest1");
    }

    void test2() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = compoundInterestCalculator.compoundInterest(20000, 0, 3);
        checkResult(actualResult, 20000, "interestZeroTest2");
    }

    void test3() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = compoundInterestCalculator.compoundInterest(10000, 15, 0);
        checkResult(actualResult, 10000, "yearsZeroTest3");
    }

    void test4() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = valueFormattingWithMathRound(compoundInterestCalculator.compoundInterest(15000, 15, 4), 2);
        checkResult(actualResult, 26235.09, "compoundInterestTest4");
    }

    void test5() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = valueFormattingWithMathRound(compoundInterestCalculator.compoundInterest(2000, 10, 5), 2);
        checkResult(actualResult, 3221.02, "compoundInterestTest5");
    }

    void test6() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double actualResult = compoundInterestCalculator.compoundInterest(5000, 30, 2);
        checkResult(actualResult, 8450, "compoundInterestTest6");
    }

    static double valueFormattingWithMathRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
