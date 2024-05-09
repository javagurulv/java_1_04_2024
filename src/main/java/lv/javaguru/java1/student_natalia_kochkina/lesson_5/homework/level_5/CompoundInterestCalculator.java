package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_5;

class CompoundInterestCalculator {
    /*
    S=A*(1+R)в степени T
    A- СУММА ВКЛАДА;
    R- СТАВКА ПРОЦЕНТА;
    T- КОЛИЧЕСТВО ПЕРИОДОВ;
    S- ПОЛУЧАЕМАЯ СУММА.
     */
    public double calculate(double investment, double interestRate, int years){
        double sum = investment * Math.pow(1 + (interestRate / 100), years);
        return sum;
    }
}
