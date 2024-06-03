package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_4.task_2;

class FactorialRecursion {

    public int factorial(int n) {
        if ((n == 1) || (n == 0)) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
