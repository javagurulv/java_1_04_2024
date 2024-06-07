package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_7_senior;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }
}
