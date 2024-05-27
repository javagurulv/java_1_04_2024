package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_4_junior;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
