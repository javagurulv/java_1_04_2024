package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_5_middle;

class CompoundInterest {
        double calculateFinalAmount(double principal, double interestRate, double interestCompoundedTimes, double periods) {
                return Math.pow((
                        1 + (interestRate/interestCompoundedTimes)),
                        (interestCompoundedTimes * periods)) * principal;
        }
}
