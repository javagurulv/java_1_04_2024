package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_7_senior;

class CompoundInterestCalculatorTest
{
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
    }
    public void test1(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(
                1000,
                0.0,
                3);
        checkResult(realResult, 1000, "Interest 0");
            }

    public void test2(){
    CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
    double realResult = compoundInterestCalculator.compoundInterest(
            0,
            0.1,
            3);
   checkResult(realResult, 0, "Sum 0");
}
    public void test3(){
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(
                1000,
                0.1,
                0);
        checkResult(realResult, 1000, "Years 0");
    }
    private void checkResult(double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("Test " + testName + " OK");
        } else{
            System.out.println("Test " + testName + " FAIL");
        }
    }
}
