package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_4.task_1;

class FactorialRecursion {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
