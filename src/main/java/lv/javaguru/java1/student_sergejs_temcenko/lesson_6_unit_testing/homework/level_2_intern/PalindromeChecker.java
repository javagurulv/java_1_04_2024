package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_2_intern;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
