package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_5_middle;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CompoundInterest {

    double totalBalance(double initialBalance, double interestRate, int years, int cyclesPerYear){

        double growth = Math.pow((1+interestRate/cyclesPerYear),cyclesPerYear*years);

        BigDecimal total = BigDecimal.valueOf(initialBalance);
        total = total.multiply(BigDecimal.valueOf(growth)); //Calculating Compound interest
        total = total.setScale(2, RoundingMode.HALF_UP); // Rounding
        double finalBalance = total.doubleValue();
        return finalBalance;
    }

    double totalBalance(double initialBalance, double interestRate, int years){
        double growth = Math.pow((1+interestRate),years);

        BigDecimal total = BigDecimal.valueOf(initialBalance);
        total = total.multiply(BigDecimal.valueOf(growth)); //Calculating Compound interest
        total = total.setScale(2, RoundingMode.HALF_UP); // Rounding
        double finalBalance = total.doubleValue();
        return finalBalance;
    }

}
