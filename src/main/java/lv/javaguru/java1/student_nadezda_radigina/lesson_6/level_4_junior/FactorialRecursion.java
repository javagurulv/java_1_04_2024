package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_4_junior;

class FactorialRecursion {
    public int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
