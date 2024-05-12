package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_3;

class TaxCalculator {

    public double tax(int value) {
        if ((value > 0) && (value < 10000)) {
            return value * 0.3;
        } else if ((value >= 10000) && (value <= 50000)) {
            return value * 0.4;
        } else if (value > 50000) {
            return value * 0.5;
        } else {
            return 0;
        }
    }
}
