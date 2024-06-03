package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_4_middle;

class SalaryApp {
    public static void main(String[] args) {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] salaryArray = {2555.00, 700.00, 300.00, 650.00, 3000.00, 0};
        System.out.println("Total Salary Expenses: " + salaryStatistics.calculateSalaryTotal(salaryArray));
        System.out.println("Average Salary: " + salaryStatistics.findAverageSalary(salaryArray));
        System.out.println("Lowest Salary: " + salaryStatistics.findMinSalary(salaryArray));
        System.out.println("Highest Salary: " + salaryStatistics.findMaxSalary(salaryArray));
    }

}
