package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_3;

class TaxCalculatorApp {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(333));
        System.out.println(taxCalculator.tax(30000));
        System.out.println(taxCalculator.tax(55000));
        System.out.println(taxCalculator.tax(0));
    }
}
