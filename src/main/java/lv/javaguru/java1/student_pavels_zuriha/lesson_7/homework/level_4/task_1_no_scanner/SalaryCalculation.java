package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_4.task_1_no_scanner;

import java.util.Scanner;

class SalaryCalculation {

    public double employeeSalarySum(double[] employeeSalaryArray) {

        double salarySum = 0.0;
        for (int i = 0; i < employeeSalaryArray.length; i++) {
            salarySum += employeeSalaryArray[i];
        }
        return salarySum;
    }

    public double employeeSalaryMax(double [] employeeSalaryArray) {

        double salaryMax = 0.0;
        for (int i = 0; i < employeeSalaryArray.length; i++) {
            if (employeeSalaryArray[i] > salaryMax) {
                salaryMax = employeeSalaryArray[i];
            }
        }
        return salaryMax;
    }

    public double employeeSalaryMin(double[] employeeSalaryArray) {

        double salaryMin = 0.0;
        for (int i = 0; i < employeeSalaryArray.length; i++) {
            if (employeeSalaryArray[i] <= employeeSalaryArray[0]) {
                salaryMin = employeeSalaryArray[i];
            }
        }
        return salaryMin;
    }

    public double employeeSalaryAverage(double[] employeeSalaryArray) {

        double salarySum = 0.0;
        if (employeeSalaryArray.length == 0) {
            return 0.0;
        } else {
            for (int i = 0; i < employeeSalaryArray.length; i++) {
                salarySum += employeeSalaryArray[i];
            }
            return salarySum / employeeSalaryArray.length;
        }
    }
}
