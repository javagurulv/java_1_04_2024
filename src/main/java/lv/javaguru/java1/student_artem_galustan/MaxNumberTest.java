package lv.javaguru.java1.student_artem_galustan;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
    }

    // test case 1: 6, 4; expected result 6
    public void testCase1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(6, 4);
        if (result == 6) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
            checkResult(result, 6, "1");
        }
    }

    // test case 2: 2, 10; expected result 10
    public void testCase2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 10);
        if (result == 10) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
        checkResult(result,10,"2");
    }

    // test case 3: 2, 2; expected result 2
    public void testCase3() {
       MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 2);
        if (result == 2) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
        checkResult(result,2,"3");
    }

    private void checkResult(int result, int expectedResult,String testName){

        if (result == expectedResult) {
            System.out.println("Test 3 = OK" + testName + "Ok");
        } else {
            System.out.println("Test 3 = FAIL" + testName + "FAIL");
        }
    }

}
