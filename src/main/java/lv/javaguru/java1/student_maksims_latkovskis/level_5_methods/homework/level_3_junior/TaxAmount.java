package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_3_junior;

import  java.math.BigDecimal;
import java.math.RoundingMode;

class TaxAmount {

    double taxAmount(double grossAmount){

        BigDecimal grossDecimal = BigDecimal.valueOf(grossAmount);
        if(grossAmount<10000 && grossAmount>0){
            BigDecimal taxRate = new BigDecimal("0.3");
            grossDecimal = grossDecimal.multiply(taxRate);
            grossDecimal = grossDecimal.setScale(2, RoundingMode.HALF_UP);
            double taxAmount = grossDecimal.doubleValue();
            return taxAmount;
        }
        else if (grossAmount >= 10000 && grossAmount < 50000){
            BigDecimal taxRate = new BigDecimal("0.4");
            grossDecimal = grossDecimal.multiply(taxRate);
            grossDecimal = grossDecimal.setScale(2, RoundingMode.HALF_UP);
            double taxAmount = grossDecimal.doubleValue();
            return taxAmount;
        }
        else if (grossAmount >= 50000){
            BigDecimal taxRate = new BigDecimal("0.5");
            grossDecimal = grossDecimal.multiply(taxRate);
            grossDecimal = grossDecimal.setScale(2, RoundingMode.HALF_UP);
            double taxAmount = grossDecimal.doubleValue();
            return taxAmount;
        }
        else {
            return 0;
        }
    }
}
