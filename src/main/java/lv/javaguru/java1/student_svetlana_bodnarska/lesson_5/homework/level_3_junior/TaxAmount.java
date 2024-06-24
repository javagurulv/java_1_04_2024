package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_3_junior;

class TaxAmount {
    double taxCalculation(double number) {
        if (number <= 10000) {
            return number * 0.30;
        } else if ((number >= 10000) && (number <= 50000)) {
            return 10000 * 0.3 + (number - 10000) * 0.40;
        } else if (number > 50000) {
            return ((10000 * 0.3) + (40000 * 0.40) + (number - 50000) * 0.50);
        } else return number;
    }
}