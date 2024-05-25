package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_2;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // text = "Monday", result = false
    public void test1(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("Monday");
        boolean expectedResult = false;
        checkResult(result, expectedResult, "test1");
    }

    // text = "Refer", result = true
    public void test2(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("Refer");
        boolean expectedResult = true;
        checkResult(result, expectedResult, "test2");
    }

    // text = "kayak", result = true
    public void test3(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("kayak");
        boolean expectedResult = true;
        checkResult(result, expectedResult, "test3");
    }

    public void checkResult(boolean realResult, boolean expectedResult, String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
