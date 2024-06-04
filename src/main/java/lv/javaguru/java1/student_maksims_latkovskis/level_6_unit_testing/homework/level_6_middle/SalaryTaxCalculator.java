package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_6_middle;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = tax30PerCent(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = tax40PerCent(salary);
        } else if (salary >= 50000) {
            tax = tax50PerCent(salary);
        } else {
            return tax;
        }
        return tax;
    }

    double tax30PerCent(double salary) {
        return (salary * 30 / 100);
    }

    double tax40PerCent(double salary) {
        return (3000 + (salary - 10000) * 40 / 100);
    }

    double tax50PerCent(double salary) {
        return (19000 + (salary - 50000) * 50 / 100);
    }

}
