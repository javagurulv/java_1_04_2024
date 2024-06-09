package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class AvgMarkFinderTest {

    public static void main(String[] args) {
        AvgMarkFinderTest test = new AvgMarkFinderTest();
        test.avgMarkShouldBe2Point75();
        test.maxMarkShouldBe4Point2();
    }

    private void avgMarkShouldBe2Point75() {
        int[] marks = {1,2,5,3};
        AvgMarkFinder finder = new AvgMarkFinder();
        double realResult = finder.findAvgMark(marks);
        checkResult(realResult, 2.75, "maxMarkShouldBe2Point75");
    }

    private void maxMarkShouldBe4Point2() {
        int[] marks = {1,2,5,3,10};
        AvgMarkFinder finder = new AvgMarkFinder();
        double realResult = finder.findAvgMark(marks);
        checkResult(realResult, 4.2, "maxMarkShouldBe4Point2");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED");
        }

    }

}
