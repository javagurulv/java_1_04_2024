package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_2_intern;

class PalindromeCheckerTest {

    public static void main(String[] args){

        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1(){
        // Case TacoCat is palindrome
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        if (palindromeChecker.isPalindrome("TacoCat") == true) {
            System.out.println("PASS test 1");
        } else {
            System.out.println("FAIL test 1");
        }
    }

    public void test2(){
        // Case 123454321 is palindrome
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        if (palindromeChecker.isPalindrome("123454321") == true) {
            System.out.println("PASS test 2");
        } else {
            System.out.println("FAIL test 2");
        }
    }

    public void test3(){
        // Case stressed desserts is palindrome
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        if (palindromeChecker.isPalindrome("stressed desserts") == true) {
            System.out.println("PASS test 3");
        } else {
            System.out.println("FAIL test 3");
        }
    }

    public void test4(){
        // Case joke is not a palindrome
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        if (palindromeChecker.isPalindrome("joke") == false) {
            System.out.println("PASS test 4");
        } else {
            System.out.println("FAIL test 4");
        }
    }
}
