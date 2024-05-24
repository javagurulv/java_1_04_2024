package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_5;

import java.math.BigDecimal;

class CompoundInterestCalculatorApp {

    public static void main(String[] args) {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();

        BigDecimal investment1 = new BigDecimal("1000");
        BigDecimal investment2 = new BigDecimal("10000");
        BigDecimal interestRate1 = new BigDecimal("10");
        BigDecimal interestRate2 = new BigDecimal("20");

        System.out.println(compoundInterestCalculator.calculate(investment1,
                interestRate1, 5));
        System.out.println(compoundInterestCalculator.calculate(investment2,
                interestRate2, 10));
    }
}
