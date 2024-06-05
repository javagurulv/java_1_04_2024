package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class MinMarkFinderTest {

    public static void main(String[] args) {
        MinMarkFinderTest test = new MinMarkFinderTest();
        test.minMarkShouldBe1();
        test.minMarkShouldBe2();
    }

    private void minMarkShouldBe1() {
        int[] marks = {1,2,5,3};
        MinMarkFinder finder = new MinMarkFinder();
        int realResult = finder.findMinMark(marks);
        checkResult(realResult, 1, "minMarkShouldBe1");
    }

    private void minMarkShouldBe2() {
        int[] marks = {3,2,5,4,10};
        MinMarkFinder finder = new MinMarkFinder();
        int realResult = finder.findMinMark(marks);
        checkResult(realResult, 2, "minMarkShouldBe2");
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
