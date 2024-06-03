package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = (salary / 100) * 30;
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = 3000 + (((salary - 10000) / 100) * 40);
        } else if (salary >= 50000) {
            tax = 19000 + (((salary - 50000) / 100) * 50);
        } else {
            return tax;
        }
        return tax;
    }

}
