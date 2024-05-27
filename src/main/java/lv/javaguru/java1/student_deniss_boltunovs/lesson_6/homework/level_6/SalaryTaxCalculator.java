package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = taxOnSalaryTill10k(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = taxOnSalaryTill50k(salary);
        } else if (salary >= 50000) {
            tax = taxOnSalaryAbove50k(salary);
        } else {
            return tax;
        }
        return tax;
    }


    private double taxOnSalaryTill10k(double salary) {
        return  (salary / 100) * 30;
    }

    private double taxOnSalaryTill50k(double salary) {
        return  3000 + (((salary - 10000) / 100) * 40);
    }

    private double taxOnSalaryAbove50k(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
