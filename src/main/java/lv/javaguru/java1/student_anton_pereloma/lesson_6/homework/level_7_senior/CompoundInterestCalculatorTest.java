package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_7_senior;

// Case 1.
// sum = 0
// interest = 0
// years = 0
// Expected result = 0

// Case 2.
// sum = 100
// interest = 0
// years = 0
// Expected Result = 100

// Case 3.
// sum = 100
// interest = 10
// years = 0
// Expected Result = 100

// Case 4.
// sum = 100
// interest = 0
// years = 10
// Expected Result = 100

// Case 5.
// sum = 0
// interest = 10
// years = 10
// Expected Result = 0

// Case 6.
// sum = 100
// interest = 10
// years = 10
// Expected Result = 259.3742460100002



class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();

        test.compoundInterestCalculatorTestSum0Interest0Years0();
        test.compoundInterestCalculatorTestSum100Interest0Years0();
        test.compoundInterestCalculatorTestSum100Interest10Years0();
        test.compoundInterestCalculatorTestSum100Interest0Years10();
        test.compoundInterestCalculatorTestSum0Interest10Years10();
        test.compoundInterestCalculatorTestSum100Interest10Years10();

    }

    public void compoundInterestCalculatorTestSum0Interest0Years0() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(0,0,0);
        checkResult(result,0,"sum 0, interest 0, years 0");
    }

    public void compoundInterestCalculatorTestSum100Interest0Years0() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(100,0,0);
        checkResult(result,100,"sum 100, interest 0, years 0");
    }

    public void compoundInterestCalculatorTestSum100Interest10Years0() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(100,10,0);
        checkResult(result,100,"sum 100, interest 10, years 0");
    }

    public void compoundInterestCalculatorTestSum100Interest0Years10() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(100,0,10);
        checkResult(result,100,"sum 100, interest 0, years 10");
    }

    public void compoundInterestCalculatorTestSum0Interest10Years10() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(0,10,10);
        checkResult(result,0,"sum 0, interest 10, years 10");
    }

    public void compoundInterestCalculatorTestSum100Interest10Years10() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(100,10,10);
        checkResult(result,259.3742460100002,"sum 100, interest 10, years 10");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
            System.out.println("Expected Result: " + expectedResult);
            System.out.println("Actual Result: " + realResult);
        }
    }
}
