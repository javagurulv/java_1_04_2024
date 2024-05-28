package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_4_junior;

class FactorialRecursion {

    public int factorial(int n) {

        return switch (n) {
            case 0, 1 -> 1;
            default -> n * factorial(n - 1);
        };
    }

}
