package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_2_intern;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();

    }

    // 1. радар; expected = true.
    public void test1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("радар");
        checkTest(result, "Test1:");
    }

    // 1. бобик; expected = false.
    public void test2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("бобик");
        checkTest(result, "Test2:");
    }

    private void checkTest(boolean result,
                           String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " NOT OK");
        }
    }

}
