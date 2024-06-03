package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_4_middle;

class SalaryStatistics {

    double calculateSalaryTotal(double[] array) {
        double sumOfSalaries = 0;
        for (int i = 0; i < array.length; i++){
            sumOfSalaries += array[i];
        }
        return sumOfSalaries;
    }

    double findMaxSalary(double[] array) {
        double maxSalary = array[0];
        for (int i = 0; i < array.length; i++){
            if (maxSalary < array[i]) {
                maxSalary = array[i];
            }
        }
        return maxSalary;
    }

    double findMinSalary(double[] array) {
        double minSalary = array[0];
        for (int i = 0; i < array.length; i++){
            if (minSalary > array[i]) {
                minSalary = array[i];
            }
        }
        return minSalary;
    }

    double findAverageSalary(double[] array) {
        return calculateSalaryTotal(array)/array.length;
    }


}
