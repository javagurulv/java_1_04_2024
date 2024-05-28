package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_5_middle;

class CompoundInterestCalculator {

    double calculateCompoundInterest(
            double principalAmount,
            double annualRate,
            int timesCompounded,
            int years) {
        return principalAmount * Math.pow((1 + annualRate / timesCompounded), timesCompounded * years);
    }

}
