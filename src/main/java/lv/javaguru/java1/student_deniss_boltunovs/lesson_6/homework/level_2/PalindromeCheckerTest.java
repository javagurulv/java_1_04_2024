package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_2;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.testNotPalindromeMonday();
        test.testIsPalindromeRefer();
        test.testIsPalindromeKayak();
    }

    // input - "Monday"
    // output - false
    public void testNotPalindromeMonday(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("Monday");
        if (result == false){
            System.out.println("TEST 1 notPalindromeMonday: OK");
        } else {
            System.out.println("TEST 1 notPalindromeMonday: FALSE (expected false, received true)");
        }
    }


    // input - "Refer"
    // output - true
    public void testIsPalindromeRefer(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("Refer");
        if (result == true){
            System.out.println("TEST 2 isPalindromeRefer: OK");
        } else {
            System.out.println("TEST 2 isPalindromeRefer: FALSE (expected true, received false)");
        }
    }


    // input - "kayak"
    // output - true
    public void testIsPalindromeKayak(){
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome("kayak");
        if (result == true){
            System.out.println("TEST 3 isPalindromeKayak: OK");
        } else {
            System.out.println("TEST 3 isPalindromeKayak: FALSE (expected true, received false)");
        }
    }


}
