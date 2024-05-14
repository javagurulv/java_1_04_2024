package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_2.task_2;

class MaxOfThreeNumbers {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

}
