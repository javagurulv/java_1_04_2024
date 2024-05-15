package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_1.task_2;

public class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.findAverageTest();
        test.findAverageTest1();

    }

    public void findAverageTest() {
        int num1 = 4;
        int num2 = 5;
        AverageFinder averageFinder = new AverageFinder();
        double findAverage = averageFinder.findAverage(num1,num2);
        checkResult(findAverage, 4.5);
    }

    public void findAverageTest1() {
        int num1 = 10;
        int num2 = 20;
        AverageFinder averageFinder = new AverageFinder();
        double findAverage = averageFinder.findAverage(num1,num2);
        checkResult(findAverage, 14);
    }

    private void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test fail");
        }

    }


}
