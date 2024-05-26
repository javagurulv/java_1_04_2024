package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_2_intern;

class MaxOfThreeNumbers {

    public int findMax(int num1, int num2, int num3) {
        int maxOfTwo = Math.max(num1, num2);
        return Math.max(maxOfTwo, num3);
    }

}
