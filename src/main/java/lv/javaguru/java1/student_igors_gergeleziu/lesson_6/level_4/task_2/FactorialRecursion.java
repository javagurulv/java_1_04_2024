package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_4.task_2;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
