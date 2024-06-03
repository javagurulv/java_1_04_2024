package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_7;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
