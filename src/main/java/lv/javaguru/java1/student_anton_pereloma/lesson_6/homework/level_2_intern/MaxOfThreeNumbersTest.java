package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_2_intern;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.validCheckMaxOfThreeNumbers1();
        test.validCheckMaxOfThreeNumbers2();
    }

    public void validCheckMaxOfThreeNumbers1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result;
        result = maxOfThreeNumbers.findMax(1,2,3);
        checkResult(result,3,"findMax");
    }

    public void validCheckMaxOfThreeNumbers2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result;
        result = maxOfThreeNumbers.findMax(4,5,7);
        checkResult(result,7,"findMax");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}
