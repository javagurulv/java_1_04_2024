package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_2_intern;

class PalindromeCheckerTest {

    // 1. madam -> true
    // 2. apple -> false

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.testMadam();
        test.testApple();

    }
    public void testMadam() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("madam");
        checkResult(realResult,true, "Madam");
    }
    public void testApple() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("apple");
        checkResult(realResult, false, "Apple");
    }
    private void checkResult(boolean realResult, boolean expectedResult, String testName){
        if (realResult == expectedResult) {
            System.out.println("TEST " + testName + " OK");
        } else {
            System.out.println("TEST " + testName + " FAIL");
        }
    }
}

