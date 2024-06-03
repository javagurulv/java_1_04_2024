package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_2_intern;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text.replace(" ", "")).reverse().toString();
        return text.replace(" ", "").equalsIgnoreCase(reversed);
    }

}
