package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_1.task_2;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        int num1 = 5;
        int num2 = 7;
        double expectedAverage = 6;

        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(num1, num2);

        if (expectedAverage == realAverage) {
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }

    public void test2() {
        int num1 = 15;
        int num2 = 2;
        double expectedAverage = 8.5;

        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(num1, num2);

        if (expectedAverage == realAverage) {
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }

    public void test3() {
        int num1 = 0;
        int num2 = 16;
        double expectedAverage = 8;

        AverageFinder averageFinder = new AverageFinder();
        double realAverage = averageFinder.findAverage(num1, num2);

        if (expectedAverage == realAverage) {
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }

}
