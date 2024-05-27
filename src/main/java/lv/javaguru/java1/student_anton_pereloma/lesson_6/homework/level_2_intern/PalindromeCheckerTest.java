package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_2_intern;

// a palindrome: madam, radar, civic


class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.validPalindromeTest();
        test.invalidPalindromeTest();

        }
    public void validPalindromeTest() {
        PalindromeChecker testPalindrome = new PalindromeChecker();
        boolean result;
        result = testPalindrome.isPalindrome("madam");
        checkResult(result,true, "validPalindromeTest");
    }
    public void invalidPalindromeTest() {
        PalindromeChecker testPalindrome = new PalindromeChecker();
        boolean result;
        result = testPalindrome.isPalindrome("test");
        checkResult(result,false, "invalidPalindromeTest");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
