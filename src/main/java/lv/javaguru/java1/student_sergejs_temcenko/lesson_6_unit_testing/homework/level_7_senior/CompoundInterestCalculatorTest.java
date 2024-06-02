package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_7_senior;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    // 1.  1000; 2; 1. expected 1020.0

    public void test1() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000, 2, 1);
        testCheck(result, 1020.0, "Test1:");
    }

    // 1.  0; 2; 1. expected 0

    public void test2() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(0, 2, 1);
        testCheck(result, 0, "Test2:");
    }

    // 1.  1000; 0; 1. expected 1000
    public void test3() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000, 0, 1);
        testCheck(result, 1000, "Test3:");
    }

    // 1.  1000; 2; 0. expected 1000
    public void test4() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000, 2, 0);
        testCheck(result, 1000, "Test4:");
    }

    private void testCheck(double result,
                           double expected,
                           String testName) {
        if (result == expected) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
