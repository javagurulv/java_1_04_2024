package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_7_senior;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
