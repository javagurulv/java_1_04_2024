package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_2_intern;

 class MaxOfThreeNumbers {
    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }
}
