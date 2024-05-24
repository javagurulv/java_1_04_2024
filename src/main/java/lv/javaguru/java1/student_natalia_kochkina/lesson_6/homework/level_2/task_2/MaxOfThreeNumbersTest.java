package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_2.task_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {

        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(5, 7, 0);
        checkResult(realMax, 7, "maxNumberTest1 ");
    }

    public void test2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(0, 777, 0);
        checkResult(realMax, 777, "maxNumberTest2 ");
    }

    public void test3() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(44, 3, 2);
        checkResult(realMax, 44, "maxNumberTest3 ");
    }

    public void test4() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(5, 5, 5);
        checkResult(realMax, 5, "maxNumberTest4 ");
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
