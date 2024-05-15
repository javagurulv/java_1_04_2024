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
        checkResult(realResult, false, "notPalindromeTest1 ");
    }

    public void test2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("level");
        checkResult(realResult, true, "palindromeTest1 ");
    }

    public void test3() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("tequila");
        checkResult(realResult, false, "notPalindromeTest2 ");
    }

    public void test4() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean realResult = palindromeChecker.isPalindrome("noon");
        checkResult(realResult, true, "palindromeTest2 ");
    }

    private void checkResult(boolean realResult, boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
