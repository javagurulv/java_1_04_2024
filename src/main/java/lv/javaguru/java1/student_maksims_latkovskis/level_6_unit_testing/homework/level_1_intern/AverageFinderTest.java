package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_1_intern;

class AverageFinderTest {

    public static void main(String[] args) {

        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();

    }

    public void test1() {
        // for 1 and 4 output expected 2.5
        AverageFinder averageFinder = new AverageFinder();

        if (averageFinder.findAverage(1, 4) == 2.5) {
            System.out.println("PASS test 1");
        } else {
            System.out.println("FAIL test 1");
        }

    }

    public void test2() {
        // for 1 and -4 output expected -1.5
        AverageFinder averageFinder = new AverageFinder();

        if (averageFinder.findAverage(1, -4) == -1.5) {
            System.out.println("PASS test 2");
        } else {
            System.out.println("FAIL test 2");
        }

    }

    public void test3() {
        // for 0 and 0 output expected 0
        AverageFinder averageFinder = new AverageFinder();

        if (averageFinder.findAverage(0, 0) == 0) {
            System.out.println("PASS test 3");
        } else {
            System.out.println("FAIL test 3");
        }

    }
}
