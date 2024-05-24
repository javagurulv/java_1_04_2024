package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CompoundInterestCalculator {
    /*
    S=A*(1+R)в степени T
    A- СУММА ВКЛАДА;
    R- СТАВКА ПРОЦЕНТА;
    T- КОЛИЧЕСТВО ПЕРИОДОВ;
    S- ПОЛУЧАЕМАЯ СУММА.


    double calculate(double investment, double interestRate, int years){
        return investment * Math.pow(1 + (interestRate / 100), years);
    }
    */

    BigDecimal calculate(BigDecimal investment,
                         BigDecimal interestRate,
                         int years) {
        BigDecimal result1 = (interestRate.divide(new BigDecimal("100")))
                .add(BigDecimal.ONE);
        return result1.pow(years).multiply(investment).setScale(2, RoundingMode.HALF_UP);
    }

}
