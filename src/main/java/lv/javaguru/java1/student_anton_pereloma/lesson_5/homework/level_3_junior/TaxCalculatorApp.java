package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_3_junior;

public class TaxCalculatorApp {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Tax Rates:");

        System.out.println(calculator.taxRate(1000) + "%");
        System.out.println(calculator.taxRate(10000) + "%");
        System.out.println(calculator.taxRate(20000) + "%");
        System.out.println(calculator.taxRate(999999) + "%");
        System.out.println(calculator.taxRate(0) + "%");
    }
}
