package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class SumCalculatorTest {

    public static void main(String[] args) {
        SumCalculatorTest test = new SumCalculatorTest();
        test.sumTest1();
    }

    public void sumTest1() {
        SumCalculator calculator = new SumCalculator();
        int realResult = calculator.calculateSumOfNumbers(1, 100);
        checkResults(realResult, 5050, "Sum");
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
