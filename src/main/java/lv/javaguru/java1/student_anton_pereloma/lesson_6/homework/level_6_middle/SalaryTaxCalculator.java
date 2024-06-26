package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_6_middle;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;

        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = calculateTaxUnder10k(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = calculateTaxUnder50k(salary);
        } else if (salary >= 50000) {
            tax = calculateTaxMoreThen50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private double calculateTaxUnder10k(double salary) {
        return (salary / 100) * 30;
    }

    private double calculateTaxUnder50k(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double calculateTaxMoreThen50k(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
