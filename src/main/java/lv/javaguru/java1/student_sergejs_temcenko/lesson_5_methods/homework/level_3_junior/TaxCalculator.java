package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_3_junior;

class TaxCalculator {

    private double calculateTaxThirtyPercent(double income) {
        return income * 0.30;
    }

    private double calculateTaxFortyPercent(double income) {
        double tax = calculateTaxThirtyPercent(10000);
        tax += (income - 10000) * 0.40;
        return tax;
    }

    private double calculateTaxFiftyPercent(double income) {
        double tax = calculateTaxFortyPercent(50000);
        tax += (income - 50000) * 0.50;
        return tax;

    }

    double calculateTax(double incame) {
        if (incame <= 10000) {
            return calculateTaxThirtyPercent(incame);
        } else if (incame <= 50000) {
            return calculateTaxFortyPercent(incame);
        } else {
            return calculateTaxFiftyPercent(incame);
        }
    }

}
