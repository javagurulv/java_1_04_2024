package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
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

    //1,2,3 -> 3
    public void test4() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(1,2,3);
        if (result == 3) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    //1,3,2 -> 3
    public void test5() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(1,3,2);
        if (result == 3) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }

    //3,2,1 -> 3
    public void test6() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(3,2,1);
        if (result == 3) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }

    //3,3,1 -> 3
    public void test7() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(3,3,1);
        if (result == 3) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }

    //3,1,3 -> 3
    public void test8() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(3,1,3);
        if (result == 3) {
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FAIL");
        }
    }

    //1,3,3 -> 3
    public void test9() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(1,3,3);
        if (result == 3) {
            System.out.println("TEST 9 = OK");
        } else {
            System.out.println("TEST 9 = FAIL");
        }
    }

    //3,3,3 -> 3
    public void test10() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(3,3,3);
        if (result == 3) {
            System.out.println("TEST 10 = OK");
        } else {
            System.out.println("TEST 10 = FAIL");
        }
    }


}
