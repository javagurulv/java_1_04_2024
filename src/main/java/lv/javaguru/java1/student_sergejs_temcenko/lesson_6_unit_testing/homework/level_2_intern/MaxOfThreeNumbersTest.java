package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_2_intern;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();

    }

    // a = 3; b = 4; c = 5; expected = 5;
    public void test1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(3, 4, 5);
        testCheck(result, 5, "Test1:");
    }

    // a = 4; b = 7; c = 10 expected = 10;
    public void test2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(4, 10, 7);
        testCheck(result, 10, "Test2:");
    }

    //a = 24, b = 13, c = 9; expected = 24
    public void test3() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(24, -13, 9);
        testCheck(result, 24, "test3:");
    }

    private void testCheck(int result,
                           int expected,
                           String testName) {
        if (result == expected) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " NOT OK");
        }
    }
}
