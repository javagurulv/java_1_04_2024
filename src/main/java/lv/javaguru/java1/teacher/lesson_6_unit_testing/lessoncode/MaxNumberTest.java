package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // 10, 5 -> 10
    // 5, 10 -> 10
    // 5, 5 -> 5

    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(10, 5);
        if (realResult == 10) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(5, 10);
        if (realResult == 10) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(5, 5);
        if (realResult == 5) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
