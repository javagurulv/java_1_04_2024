package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // 2, 5 -> 5
    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 5);
        if (result == 5) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    // 5, 2 -> 5
    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(5, 2);
        if (result == 5) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    // 5, 5 -> 5
    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(5, 5);
        if (result == 5) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
