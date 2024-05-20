package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

class PayrollCalculatorApp {

    public static void main(String[] args) {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = calculator.createPayrollArray();

        System.out.println(calculator.calculateSalarySum(salaries));
        System.out.println(calculator.calculateMaxSalary(salaries));
        System.out.println(calculator.calculateMinSalary(salaries));
        System.out.println(calculator.calculateAverageSalary(salaries));
        System.out.println(calculator.calculateSigma(salaries));
    }
}
