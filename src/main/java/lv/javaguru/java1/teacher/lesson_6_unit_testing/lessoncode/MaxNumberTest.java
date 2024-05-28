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
        checkResult(realResult, 10, "1");
    }

    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(5, 10);
        checkResult(realResult, 10, "2");
    }

    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMax(5, 5);
        checkResult(realResult, 5, "3");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " =  FAIL");
        }
    }

}
