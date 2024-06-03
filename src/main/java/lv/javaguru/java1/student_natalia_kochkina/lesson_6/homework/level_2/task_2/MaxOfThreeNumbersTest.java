package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_2.task_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {

        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.firstNumberIsMaxTest();
        test.secondNumberIsMaxTest();
        test.thirdNumberIsMaxTest();
        test.numbersAreEqualsTest();
    }

    public void firstNumberIsMaxTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(7, 5, 0);
        checkResult(realMax, 7, "firstNumberIsMaxTest ");
    }

    public void secondNumberIsMaxTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(0, 777, 0);
        checkResult(realMax, 777, "secondNumberIsMaxTest ");
    }

    public void thirdNumberIsMaxTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(4, 3, 44);
        checkResult(realMax, 44, "thirdNumberIsMaxTest ");
    }

    public void numbersAreEqualsTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(5, 5, 5);
        checkResult(realMax, 5, "numbersAreEqualsTest ");
    }

    private void checkResult(int realMax, int expectedMax,
                             String testScenarioName) {
        if (expectedMax == realMax) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
