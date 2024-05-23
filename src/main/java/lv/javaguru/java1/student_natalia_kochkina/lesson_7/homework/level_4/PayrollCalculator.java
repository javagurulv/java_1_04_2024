package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

class PayrollCalculator {

    double calculateSalarySum(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) {
            sum = sum + salary;
        }
        return sum;
    }

    double calculateMinSalary(double[] salaries) {
        double min = salaries[0];
        for (double salary : salaries) {
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }

    double calculateMaxSalary(double[] salaries) {
        double max = salaries[0];
        for (double salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

    double calculateAverageSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0;
        } else {
            return calculateSalarySum(salaries) / salaries.length;
        }
    }

    double calculateSigma(double[] salaries) {
        double average = calculateAverageSalary(salaries);
        double squaredDifferences = 0;
        for (double salary : salaries) {
            squaredDifferences = squaredDifferences + Math.pow((salary - average), 2);
        }
        return Math.sqrt(squaredDifferences / salaries.length);
    }

}
