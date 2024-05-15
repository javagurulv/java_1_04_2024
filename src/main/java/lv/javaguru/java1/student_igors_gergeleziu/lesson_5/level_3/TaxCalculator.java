package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_3;

class TaxCalculator {
    float calculateTax(float income) {
        if (income < 10000) return income *= 0.3;
        else if (income >= 10000 && income <= 50000) return income *= 0.4;
        else if (income > 50000) return income *= 0.5;
        else return 0;
    }
}
