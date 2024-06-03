package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_1_intern.task_2;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();

    }

    // enter 2, 4;
    // exit 3;
    public void test1() {
        AverageFinder averageFinder = new AverageFinder();
        double num1 = 2;
        double num2 = 4;
        double expected = 4;
        double result = averageFinder.findAverage(num1, num2);
        checkTest(result, expected, "test1");
        /*        if (result == expected) {
            System.out.println("OK");
        } else {
            System.out.println("Not Good");
        }   */
    }

    public void test2() {
        AverageFinder averageFinder = new AverageFinder();
        double num1 = 4;
        double num2 = 6;
        double expected = 5;
        double result = averageFinder.findAverage(num1, num2);
        checkTest(result, expected, "test2");

    }

    public void test3() {
        AverageFinder averageFinder = new AverageFinder();
        double num1 = -3;
        double num2 = 5;
        double expected = 2;
        double result = averageFinder.findAverage(num1, num2);
        checkTest(result, expected, "test3");
    }

    private void checkTest(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println("OK");
        } else {
            System.out.println("Not Good " + testName + " Expected " + expected + " but have " + result);
        }
    }


}

