package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_3;

import java.math.BigDecimal;

class TaxCalculatorApp {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculateTax(new BigDecimal("9000")));
        System.out.println(taxCalculator.calculateTax(new BigDecimal("30000")));
        System.out.println(taxCalculator.calculateTax(new BigDecimal("60555.555")));
        System.out.println(taxCalculator.calculateTax(BigDecimal.ZERO));
    }
}
