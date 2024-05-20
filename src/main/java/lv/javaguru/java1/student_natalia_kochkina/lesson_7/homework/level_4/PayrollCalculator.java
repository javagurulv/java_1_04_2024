package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

import java.util.Scanner;

class PayrollCalculator {

    public double[] createPayrollArray() {
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

    public double calculateSalarySum(double[] salaries) {
        double sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum = sum + salaries[i];
        }
        return sum;
    }

    public double calculateMinSalary(double[] salaries) {
        double min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < min) {
                min = salaries[i];
            }
        }
        return min;
    }

    public double calculateMaxSalary(double[] salaries) {
        double max = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
        }
        return max;
    }

    public double calculateAverageSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0;
        } else {
            return calculateSalarySum(salaries) / salaries.length;
        }
    }

    public double calculateSigma(double[] salaries) {
        double average = calculateAverageSalary(salaries);
        double squaredDifferences = 0;
        for (int i = 0; i < salaries.length; i++) {
            squaredDifferences = squaredDifferences + Math.pow((salaries[i] - average), 2);
        }
        return Math.sqrt(squaredDifferences / salaries.length);
    }

}
