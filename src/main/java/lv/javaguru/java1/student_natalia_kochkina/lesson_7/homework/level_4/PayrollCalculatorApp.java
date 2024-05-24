package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

import java.util.Scanner;

class PayrollCalculatorApp {

    public static void main(String[] args) {
        PayrollCalculator calculator = new PayrollCalculator();

        double[] salaries = createPayroll();

        System.out.println("Salary sum = " +
                calculator.calculateSalarySum(salaries));
        System.out.println("Max salary = " +
                calculator.calculateMaxSalary(salaries));
        System.out.println("Min salary = " +
                calculator.calculateMinSalary(salaries));
        System.out.println("Average salary = " +
                calculator.calculateAverageSalary(salaries));
        System.out.println("Sigma = " +
                calculator.calculateSigma(salaries));
    }

    private static double[] createPayroll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of salaries:");
        int length = scanner.nextInt();

        double[] salaries = new double[length];

        System.out.println("Enter employee salaries:");
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = scanner.nextDouble();
        }
        return salaries;
    }
}
