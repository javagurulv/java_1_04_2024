package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_7;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(10000,
                10, 1);
        checkResult(realResult, 11000, "Test 10000, 10%, 1 year ");
    }

    public void test2() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(0,
                15, 10);
        checkResult(realResult, 0, "Test with sum = 0 ");
    }

    public void test3() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(50000,
                0, 12);
        checkResult(realResult, 50000, "Test with interest = 0 ");
    }

    public void test4() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(33000,
                43, 0);
        checkResult(realResult, 33000, "Test with years = 0 ");
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
