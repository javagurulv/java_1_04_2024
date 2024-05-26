package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_1_intern;

//    num1 = 1, num2 = 1, expected result = 1;
//    num1 = 1, num2 = 2, expected result = 1.5
//    num1 = 1, num2 = 3, expected result = 2

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.checkAverageTest1();
        test.checkAverageTest2();
        test.checkAverageTest3();

    }

    public void checkAverageTest1() {
        AverageFinder averageFinder = new AverageFinder();
        double result;
        result = averageFinder.findAverage(1,1);
        checkResult(result,1,"checkAverage");

    }

    public void checkAverageTest2() {
        AverageFinder averageFinder = new AverageFinder();
        double result;
        result = averageFinder.findAverage(1,2);
        checkResult(result,1.5,"checkAverage");

    }

    public void checkAverageTest3() {
        AverageFinder averageFinder = new AverageFinder();
        double result;
        result = averageFinder.findAverage(1,3);
        checkResult(result,2,"checkAverage");

    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
