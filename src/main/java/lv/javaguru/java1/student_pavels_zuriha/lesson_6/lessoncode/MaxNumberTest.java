package lv.javaguru.java1.student_pavels_zuriha.lesson_6.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.shouldReturnNumberFirst();
        test.shouldReturnNumberSecond();
        test.shouldReturnNumberEqual();
    }

    public void shouldReturnNumberSecond() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(1, 7);
        checkResult(realResult, 7, "shouldReturnSecondNumber");
    }

    public void shouldReturnNumberFirst() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(4, 1);
        checkResult(realResult, 4, "shouldReturnFirstNumber");
    }

    public void shouldReturnNumberEqual() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(5, 5);
        checkResult(realResult, 5, "shouldReturnEqualNumber");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String scenarioTitle) {
        if (realResult == expectedResult) {
            System.out.println(scenarioTitle + ": TEST OK");
        } else {
            System.out.println(scenarioTitle + ": TEST FAILED");
        }
    }
}
