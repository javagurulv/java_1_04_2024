package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_2.task_1;

class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test= new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }
    void test1(){
        PalindromeChecker palindromeChecker= new PalindromeChecker();
        boolean actualResult=palindromeChecker.isPalindrome("mom");
        checkResult(actualResult, true, "palindromeCheckerTest1");
    }
    void test2(){
        PalindromeChecker palindromeChecker= new PalindromeChecker();
        boolean actualResult=palindromeChecker.isPalindrome("dog");
        checkResult(actualResult, false, "palindromeCheckerTest2");
    }
    void test3(){
        PalindromeChecker palindromeChecker= new PalindromeChecker();
        boolean actualResult=palindromeChecker.isPalindrome("racecar");
        checkResult(actualResult, true, "palindromeCheckerTest3");
    }
    void test4(){
        PalindromeChecker palindromeChecker= new PalindromeChecker();
        boolean actualResult=palindromeChecker.isPalindrome("Hannah");
        checkResult(actualResult, true, "palindromeCheckerTest4");
    }
    void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
