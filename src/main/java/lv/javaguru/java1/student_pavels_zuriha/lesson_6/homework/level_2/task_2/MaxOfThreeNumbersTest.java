package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_2.task_2;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.findMaxTest();

    }

    public void findMaxTest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(5,5,15);
        checkResult(realResult, 15);
    }



    private void checkResult(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is ok");
        } else {
            System.out.println("Test failed");
        }

    }



}
