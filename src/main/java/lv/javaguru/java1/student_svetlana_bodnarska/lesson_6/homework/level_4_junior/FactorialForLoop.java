package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_4_junior;

class FactorialForLoop {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
