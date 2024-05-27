package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_7;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();

        test.testParameterSumZero();
        test.testParameterInterestZero();
        test.testParameterYearZero();
        test.testAllParametersNonZero();
    }


    // sum = 0 , interest = 5 , year = 6, result = 0
    public void testParameterSumZero() {
        CompoundInterestCalculator interest = new CompoundInterestCalculator();
        double realResult = interest.compoundInterest(0,5,6);
        double expectedResult = 0;
        checkResult(realResult, expectedResult, "testParameterSumZero");
    }

    // sum = 1000 , interest = 0 , year = 6, result = 1000
    public void testParameterInterestZero() {
        CompoundInterestCalculator interest = new CompoundInterestCalculator();
        double realResult = interest.compoundInterest(1000,0,6);
        double expectedResult = 1000;
        checkResult(realResult, expectedResult, "testParameterInterestZero");
    }

    // sum = 1000 , interest = 5 , year = 0, result = 1000
    public void testParameterYearZero() {
        CompoundInterestCalculator interest = new CompoundInterestCalculator();
        double realResult = interest.compoundInterest(1000,5,0);
        double expectedResult = 1000;
        checkResult(realResult, expectedResult, "testParameterYearZero");
    }

    // sum = 1000 , interest = 5 , year = 6, result = 1340.095640625
    public void testAllParametersNonZero() {
        CompoundInterestCalculator interest = new CompoundInterestCalculator();
        double realResult = interest.compoundInterest(1000,5,6);
        double expectedResult = 1340.0956406250004;
        checkResult(realResult, expectedResult, "testAllParametersNonZero");
    }


    public void checkResult(double realResult,
                            double expectedResult,
                            String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
