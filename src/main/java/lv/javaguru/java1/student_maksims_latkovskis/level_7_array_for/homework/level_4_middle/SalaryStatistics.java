package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_4_middle;

class SalaryStatistics {

    public static void main(String[] args){

        double [] salaries = {455, 580, 3000, 620 , 390};
        SalaryStatistics stats = new SalaryStatistics();
        System.out.println("The total budget is: " + stats.salaryBudget(salaries));
        System.out.println("The mean salary is: " + stats.meanSalary(salaries));
        System.out.println("The standard deviation is: " + stats.salaryDeviation(salaries));
        System.out.println("The minimum salary is : " + stats.minimumSalary(salaries));
        System.out.println("The maximum salary is :" + stats.maximumSalary(salaries));
    }



    double salaryBudget(double [] salaries){
        double salaryBudget = 0;
        for(int i = 0; i<salaries.length; i++){
            salaryBudget += salaries[i];
        }
        return  salaryBudget;

    }

    double meanSalary(double [] salaries){
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double meanSalary = salaryStatistics.salaryBudget(salaries);
        meanSalary = meanSalary/salaries.length;
        return  meanSalary;
    }

    double minimumSalary(double [] salaries){
        double minimumSalary = salaries[0];
        for(int i = 0; i<salaries.length; i++){
         if(salaries[i] < minimumSalary) minimumSalary = salaries[i];
        }
        return  minimumSalary;
    }

    double maximumSalary(double [] salaries){
        double maximumSalary = salaries[0];
        for(int i = 0; i<salaries.length; i++){
            if(salaries[i] > maximumSalary) maximumSalary = salaries[i];
        }
        return  maximumSalary;
    }

    double salaryDeviation(double [] salaries){
        double allDeviationSum = 0;
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double meanSalary = salaryStatistics.meanSalary(salaries);
        for(int i = 0; i<salaries.length; i++){
            allDeviationSum += Math.pow(salaries[i] - meanSalary, 2);
        }
        return Math.sqrt(allDeviationSum / (salaries.length - 1 ));
    }


}
