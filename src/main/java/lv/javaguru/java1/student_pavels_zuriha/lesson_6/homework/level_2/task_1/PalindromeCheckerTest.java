package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_2.task_1;

class PalindromeCheckerTest {
    public static void main (String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.isPalindromeTest();
        test.notPalindromeTest();


    }

    public void isPalindromeTest() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("teet");
        checkResult(realResult, true);
    }

    public void notPalindromeTest() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("asdgpko");
        checkResult(realResult, false);
    }

    private void checkResult(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is Ok");
        } else {
            System.out.println("Test fail");
        }

    }

}
