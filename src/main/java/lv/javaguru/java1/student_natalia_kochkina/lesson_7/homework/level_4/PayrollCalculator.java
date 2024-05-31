package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

class PayrollCalculator {

    BigDecimal calculateSalarySum(BigDecimal[] salaries) {
        if (salaries.length == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal salary : salaries) {
            sum = sum.add(salary);
        }
        return sum;
    }

    BigDecimal calculateMinSalary(BigDecimal[] salaries) {
        if (salaries.length == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal minSalary = salaries[0];
        for (BigDecimal salary: salaries) {
            if (salary.compareTo(minSalary) < 0) {
                minSalary = salary;
            }
        }
        return minSalary;
    }

    BigDecimal calculateMaxSalary(BigDecimal[] salaries) {
        if (salaries.length == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal maxSalary = salaries[0];
        for (BigDecimal salary: salaries) {
            if (salary.compareTo(maxSalary) > 0) {
                maxSalary = salary;
            }
        }
        return maxSalary;
    }

    BigDecimal calculateAverageSalary(BigDecimal[] salaries) {
        if (salaries.length == 0) {
            return BigDecimal.ZERO;
        } else {
            return calculateSalarySum(salaries).
                    divide(new BigDecimal(salaries.length),
                            2, RoundingMode.HALF_UP);
        }
    }

    BigDecimal calculateSigma(BigDecimal[] salaries) {
        if (salaries.length == 0) {
            return BigDecimal.ZERO;
        }
        BigDecimal averageSalary = calculateAverageSalary(salaries);
        BigDecimal sumOfSquares = BigDecimal.ZERO;
        for (BigDecimal salary: salaries) {
            sumOfSquares = (salary.subtract(averageSalary)).pow(2).add(sumOfSquares)
                    .setScale(2, RoundingMode.HALF_UP);
        }
        BigDecimal averageOfSquares = sumOfSquares
                .divide(new BigDecimal(salaries.length),
                        2, RoundingMode.HALF_UP);
        return averageOfSquares.sqrt(new MathContext(10))
                .setScale(2, RoundingMode.HALF_UP);
    }

}
