package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

public class MathGradeCalculatorTest {
    public static void main(String[] args){
        MathGradeCalculatorTest test = new MathGradeCalculatorTest();
        test.test1();
        test.test2();

    }
    void test1(){
     MathGradeCalculator calculator = new MathGradeCalculator();
     int[] grades = {1, 4, 6, 8, 2};
     int realResult = calculator.findMaxGrade(grades);
     checkResult(realResult, 8, "TEST 1");
    }

    void test2(){
        MathGradeCalculator calculator = new MathGradeCalculator();
        int[] grades = {6, 7, 9, 8, 3};
        int realResult = calculator.findMaxGrade(grades);
        checkResult(realResult, 9, "TEST 2");
    }
    private void checkResult(int realResult, int expectedResult,String testScenarioName){
        if (realResult == expectedResult){
            System.out.println(testScenarioName + ": OK");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }
    }

}
