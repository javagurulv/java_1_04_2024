package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_3_junior;

class TaxCalculator {

    public double calculateTax (double income) {
        double tax = 0.0;

        if (income <= 10000) {
            tax = income * 0.30;
        } else if (income <= 50000) {
            tax = 10000 * 0.30 + (income - 10000) * 0.40;
        } else {
            tax = 10000 * 0.30 + 40000 * 0.40 + (income - 50000) * 0.50;
        }

        return tax;
    }
}
