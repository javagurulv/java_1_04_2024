package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_2.task_1;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
