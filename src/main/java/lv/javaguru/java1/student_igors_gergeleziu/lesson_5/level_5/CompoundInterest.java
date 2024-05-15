package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_5;

class CompoundInterest {
    /*
    p - original principal amount
    r - nominal annual interest rate
    t - length of time the interest is applied
     */
    double calculateCompoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + (r / 100)), t);
    }

}
