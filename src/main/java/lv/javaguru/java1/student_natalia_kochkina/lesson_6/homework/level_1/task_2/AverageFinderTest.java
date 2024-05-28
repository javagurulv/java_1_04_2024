package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_1.task_2;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(5, 7);
        checkResult(realAverage, 6,
                "AverageNumber1 ");
    }

    public void test2() {
        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(15, 2);
        checkResult(realAverage, 8.5,
                "AverageNumber2 ");
    }

    public void test3() {
        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(0, 16);
        checkResult(realAverage, 8,
                "AverageNumber3 ");
    }

    private void checkResult(double realResult, double expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = OK");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }

}
