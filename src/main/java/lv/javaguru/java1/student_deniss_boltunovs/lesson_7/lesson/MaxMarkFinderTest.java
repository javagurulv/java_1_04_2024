package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class MaxMarkFinderTest {

    public static void main(String[] args) {
        MaxMarkFinderTest test = new MaxMarkFinderTest();
        test.maxMarkShouldBe5();
        test.maxMarkShouldBe10();
    }

    private void maxMarkShouldBe5() {
        int[] marks = {1,2,5,3};
        MaxMarkFinder finder = new MaxMarkFinder();
        int realResult = finder.findMaxMark(marks);
        checkResult(realResult, 5, "maxMarkShouldBe5");
    }

    private void maxMarkShouldBe10() {
        int[] marks = {1,2,5,3,10};
        MaxMarkFinder finder = new MaxMarkFinder();
        int realResult = finder.findMaxMark(marks);
        checkResult(realResult, 10, "maxMarkShouldBe10");
    }


    private void checkResult(int realResult,
                             int expectedResult,
                             String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED");
        }

    }

}
