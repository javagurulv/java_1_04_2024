package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_2.task_1;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("cucumber");
        checkResult(realResult, false, "not palindrome1 ");
    }

    public void test2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("level");
        checkResult(realResult, true, "is palindrome1 ");
    }

    public void test3() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("tequila");
        checkResult(realResult, false, "not palindrome2 ");
    }

    public void test4() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("noon");
        checkResult(realResult, true, "is palindrome2 ");
    }

    private void checkResult(boolean realResult, boolean expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = OK");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }
}
