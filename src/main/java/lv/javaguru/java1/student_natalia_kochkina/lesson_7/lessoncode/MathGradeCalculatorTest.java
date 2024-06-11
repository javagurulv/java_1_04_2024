package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class MathGradeCalculatorTest {

    public static void main(String[] args) {
        MathGradeCalculatorTest test = new MathGradeCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        MathGradeCalculator calculator = new MathGradeCalculator();
        int[] grades = {3, 8, 5, 9, 7, 6};
        int realResult = calculator.findMaxGrade(grades);
        checkResults(realResult, 9, "Should find max grade1");
    }

    public void test2() {
        MathGradeCalculator calculator = new MathGradeCalculator();
        int[] grades = {3, 8, 10, 5, 9, 10, 7, 6};
        int realResult = calculator.findMaxGrade(grades);
        checkResults(realResult, 10, "Should find max grade2");
    }

    public void test3() {
        MathGradeCalculator calculator = new MathGradeCalculator();
        int[] grades = {3, 8, 5, 9, 7, 6};
        int realResult = calculator.findMinGrade(grades);
        checkResults(realResult, 3, "Should find min grade1");
    }

    public void test4() {
        MathGradeCalculator calculator = new MathGradeCalculator();
        int[] grades = {1, 8, 2, 9, 7, 7};
        int realResult = calculator.findMinGrade(grades);
        checkResults(realResult, 1, "Should find min grade2");
    }

    private void checkResults(int realResult, int expectedResult,
                              String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + " TEST OK");
        } else {
            System.out.println(testScenarioName + " TEST FAIL");
        }
    }

}
