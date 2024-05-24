package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_3_junior;

class TaxCalculatorApplication {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculateTax(10000));
        System.out.println(taxCalculator.calculateTax(20000));
        System.out.println(taxCalculator.calculateTax(60000));
    }
}
