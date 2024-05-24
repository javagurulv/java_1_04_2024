package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_7;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {

        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.sumZero();
        test.interestZero();
        test.yearsZero();

    }

    // sum = 0 scenario

    public void sumZero() {

        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(0, 10, 1);
        checkResult(realResult, 0);
    }
    // interest = 0 scenario

    public void interestZero() {

        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(1000, 0, 1);
        checkResult(realResult, 1000);
    }
    // years = 0 scenario

    public void yearsZero() {

        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(1000, 5, 0);
        checkResult(realResult, 1000);
    }

    private void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }


}
