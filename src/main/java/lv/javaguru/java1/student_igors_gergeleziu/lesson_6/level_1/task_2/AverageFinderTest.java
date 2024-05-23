package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_1.task_2;

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    void test1() {
        AverageFinder averageFinder = new AverageFinder();
        double actualResult = averageFinder.findAverage(2, 2);
        checkResult(actualResult, 2, "averageFinderTest1");
    }

    void test2() {
        AverageFinder averageFinder = new AverageFinder();
        double actualResult = averageFinder.findAverage(0, 0);
        checkResult(actualResult, 0, "averageFinderTest2");
    }

    void test3() {
        AverageFinder averageFinder = new AverageFinder();
        double actualResult = averageFinder.findAverage(5, 2);
        checkResult(actualResult, 3.5, "averageFinderTest3");
    }

    void test4() {
        AverageFinder averageFinder = new AverageFinder();
        double actualResult = averageFinder.findAverage(12, 11);
        checkResult(actualResult, 11.5, "averageFinderTest4");
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
