package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_2_intern;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
