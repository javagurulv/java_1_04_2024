package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_6;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = tax30(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = tax40(salary);
        } else if (salary >= 50000) {
            tax = tax50(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private double tax30(double salary) {
        return (salary / 100) * 30;
    }

    private double tax40(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double tax50(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
