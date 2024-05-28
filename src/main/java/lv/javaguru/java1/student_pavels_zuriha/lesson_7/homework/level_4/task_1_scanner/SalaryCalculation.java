package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_4.task_1_scanner;

import java.util.Scanner;

class SalaryCalculation {

    public double[] employeeSalaryArrayCreation(int employeeAmount) {

        double[] employeeSalaryArray = new double[employeeAmount];
        double employeeSalary = 0.0;
        for (int i = 0; i < employeeAmount; i++) {
            System.out.println("Введите зарплату сотрудника Nr" + (i + 1));
            Scanner scanner = new Scanner(System.in);
            employeeSalary = scanner.nextDouble();
            employeeSalaryArray[i] = employeeSalary;
        }
        return employeeSalaryArray;
    }

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

        double salaryMin = employeeSalaryArray[0];
        for (int i = 0; i < employeeSalaryArray.length; i++) {
            if (employeeSalaryArray[i] < salaryMin) {
                salaryMin = employeeSalaryArray[i];
            }
        }
        return salaryMin;
    }

    public double employeeSalaryAverage(double[] employeeSalaryArray) {

        double salarySum = 0.0;
        for (int i = 0; i < employeeSalaryArray.length; i++) {
            salarySum += employeeSalaryArray[i];
        }
        return salarySum / employeeSalaryArray.length;
    }

}
