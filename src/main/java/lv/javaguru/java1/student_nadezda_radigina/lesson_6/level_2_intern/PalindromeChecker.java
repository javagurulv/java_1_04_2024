package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_2_intern;

 class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
