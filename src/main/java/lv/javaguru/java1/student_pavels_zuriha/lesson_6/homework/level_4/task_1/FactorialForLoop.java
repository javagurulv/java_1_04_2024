package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_4.task_1;

class FactorialForLoop {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
