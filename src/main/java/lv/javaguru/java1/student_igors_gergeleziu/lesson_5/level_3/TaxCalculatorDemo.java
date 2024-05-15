package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_3;

class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("Tax 30% for 2000 income: " + taxCalculator.calculateTax(2000));
        System.out.println("Tax 40% for 25000 income: " + taxCalculator.calculateTax(25000));
        System.out.println("Tax 50% for 60000 income: " + taxCalculator.calculateTax(60000));
    }
}
