package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_6_middle;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        if (salary < 0) {
            return 0;
        } else if (salary < 10000) {
            return calculateTaxBelow10000(salary);
        } else if (salary < 50000) {
            return calculateTaxBetween10000And50000(salary);
        } else {
            return calculateTaxAbove50000(salary);
        }
    }

    private double calculateTaxBelow10000(double salary) {
        return (salary / 100) * 30;
    }

    private double calculateTaxBetween10000And50000(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double calculateTaxAbove50000(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

}
