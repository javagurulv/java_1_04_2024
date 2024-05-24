package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

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

    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(2, 5);
        if (result == 5) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    // 5, 2 -> 5
    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(5, 2);
        if (result == 5) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    // 5, 5 -> 5
    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(5, 5);
        if (result == 5) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    //5, 5, 5, -> 5
    public void test4() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(5, 5, 5);
        if (result == 5) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    //2, 3, 6 -> 6
    public void test5() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(2, 3, 6);
        if (result == 6) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }

    //2, 6, 1 -> 6
    public void test6() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(2, 6, 1);
        if (result == 6) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }

    //4, 2, 3 -> 4
    public void test7() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(4, 2, 3);
        if (result == 4) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }

    //3, 3, 1 -> 3
    public void test8() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(3, 3, 1);
        if (result == 3) {
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FAIL");
        }
    }

    //3, 1, 3 -> 3
    public void test9() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(3, 1, 3);
        if (result == 3) {
            System.out.println("TEST 9 = OK");
        } else {
            System.out.println("TEST 9 = FAIL");
        }
    }

    //1, 3, 3 -> 3
    public void test10() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxOfThreeNumbers(1, 3, 3);
        if (result == 3) {
            System.out.println("TEST 10 = OK");
        } else {
            System.out.println("TEST 10 = FAIL");
        }
    }


}
