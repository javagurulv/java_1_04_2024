package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            return thirtyPercentTax(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            return fortyPercentTax(salary);
        } else if (salary >= 50000) {
            return fiftyPercentTax(salary);
        } else {
            return tax;
        }
        return tax;
    }

    double thirtyPercentTax(double salary) {
        return (salary / 100) * 30;
    }

    double fortyPercentTax(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    double fiftyPercentTax(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
