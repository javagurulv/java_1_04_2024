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
        String text = "cucumber";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);
        if (!result) {
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }

    public void test2() {
        String text = "level";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);
        if (result) {
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }

    public void test3() {
        String text = "tequila";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);
        if (!result) {
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }

    public void test4() {
        String text = "noon";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome(text);
        if (result) {
            System.out.println("TEST4 = OK");
        } else {
            System.out.println("TEST4 = FAIL");
        }
    }
}
