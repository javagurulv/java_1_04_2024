package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_1_intern;

class AverageFinderTest {
    // 1. 2, 2 -> 2
    // 2. 0, 0 -> 0
    // 3. 5, 7 -> 6
    // 4. 7, 5 -> 6
    // 5. -10, 20 -> 5
    // 6. -10, -10 -> -10
    // 7. 5.5, 5.5 -> 5.5

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }
    public void test1() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(2, 2);
        if (realResult == 2) {
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }
    public void test2() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(0, 0);
        if (realResult == 0) {
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }
    public void test3() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(5, 7);
        if (realResult == 6) {
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }
    public void test4() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(7, 5);
        if (realResult == 6) {
            System.out.println("TEST4 = OK");
        } else {
            System.out.println("TEST4 = FAIL");
        }
    }
    public void test5() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(-10, 20);
        if (realResult == 5) {
            System.out.println("TEST5 = OK");
        } else {
            System.out.println("TEST5 = FAIL");
        }
    }
    public void test6() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(-10, -10);
        if (realResult == -10) {
            System.out.println("TEST6 = OK");
        } else {
            System.out.println("TEST6 = FAIL");
        }
    }
    public void test7() {
        AverageFinder averageFinder = new AverageFinder();
        double realResult = averageFinder.findAverage(5.5, 5.5);
        if (realResult == 5.5) {
            System.out.println("TEST7 = OK");
        } else {
            System.out.println("TEST7 = FAIL");
        }
    }
}
