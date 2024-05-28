package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_4.task_1_scanner;

import java.util.Scanner;

class SalaryCalculationApp {

    public static void main(String[] args) {

        SalaryCalculation salaryCalculation = new SalaryCalculation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во сотрудников: ");
        int employeeAmount = scanner.nextInt();

        double[] employeeSalaryArray = salaryCalculation.employeeSalaryArrayCreation(employeeAmount);
        double employeeSalarySum = salaryCalculation.employeeSalarySum(employeeSalaryArray);
        double employeeSalaryMax = salaryCalculation.employeeSalaryMax(employeeSalaryArray);
        double employeeSalaryMin = salaryCalculation.employeeSalaryMin(employeeSalaryArray);
        double employeeSalaryAverage = salaryCalculation.employeeSalaryAverage(employeeSalaryArray);

        System.out.println("Общее кол-во сотрудников: " + employeeAmount);
        System.out.println("Общие расходы на зарплаты: " + employeeSalarySum);
        System.out.println("Максимальная зарплата сотрудника: " + employeeSalaryMax);
        System.out.println("Минимальная зарплата сотрудника: " + employeeSalaryMin);
        System.out.println("Средняя зарплата сотрудников: " + employeeSalaryAverage);

    }
}
