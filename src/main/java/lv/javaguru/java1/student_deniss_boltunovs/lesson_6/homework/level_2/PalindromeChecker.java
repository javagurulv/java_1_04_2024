package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_2;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
