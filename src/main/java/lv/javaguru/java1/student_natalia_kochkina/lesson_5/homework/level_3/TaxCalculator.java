package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculator {

    BigDecimal calculateTax(BigDecimal value) {
        BigDecimal tax = BigDecimal.ZERO;

        if ((value.compareTo(new BigDecimal("10000")) < 0) &&
            (value.compareTo(BigDecimal.ZERO) > 0)) {
            tax = value.multiply(new BigDecimal("0.3"));
        }

        if ((value.compareTo(new BigDecimal("10000")) >= 0) &&
            (value.compareTo(new BigDecimal("50000")) <= 0)) {
            tax = (value.subtract(new BigDecimal("10000"))).multiply(
                    new BigDecimal("0.4")).add(new BigDecimal("3000"));
        }

        if (value.compareTo(new BigDecimal("50000")) > 0) {
            tax = (value.subtract(new BigDecimal("50000"))).multiply(
                    new BigDecimal("0.5")).add(new BigDecimal("19000"));
        }

        return tax.setScale(2, RoundingMode.HALF_UP);
    }


}
