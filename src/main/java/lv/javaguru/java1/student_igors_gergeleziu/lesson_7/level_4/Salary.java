package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_4;

class Salary {
    double calculateTotalSalary(double[] array) {
        double total = 0;
        for (double salary : array) {
            total += salary;
        }
        return total;
    }

    double calculateAverageSalary(double[] array) {
        return calculateTotalSalary(array) / array.length;
    }

    double calculateStandardDeviation(double[] array) {
        double averageSalary = calculateAverageSalary(array);
        double squareDeviations = 0;
        for (double salary : array) {
            squareDeviations += Math.pow((salary - averageSalary), 2);
        }
        double variance = squareDeviations / array.length;
        return Math.sqrt(variance);
    }

    double findMaxSalary(double[] array) {
        double max = 0;
        for (double salary : array) {
            if (salary > max) max = salary;
        }
        return max;
    }

    double findMinSalary(double[] array) {
        double min = array[0];
        for (double salary : array) {
            if (salary < min) min = salary;
        }
        return min;
    }
}
