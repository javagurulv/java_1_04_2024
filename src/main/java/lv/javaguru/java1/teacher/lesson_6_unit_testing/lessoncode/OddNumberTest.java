package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class OddNumberTest {

    // Test data
    // 2 -> false - test case 1
    // 0 -> false - test case 2
    // -1 -> true - test case 3

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(2);
        if (isOdd == false) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(0);
        if (isOdd == false) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(-1);
        if (isOdd == true) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
