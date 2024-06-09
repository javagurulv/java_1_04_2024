package lv.javaguru.java1.student_sergejs_temcenko.lesson_7_array_for.homework.level_4_middle;

class SalaryAnalysis {

    public double getTotalSalaries (double[] salaries) {
        double totalSalaries = 0;
        for (int salary = 0; salary < salaries.length; salary++){
            totalSalaries += salaries[salary];
        }
        return totalSalaries;
    }

    public double getMinSalaries (double[] salaries) {
        double minSalaries = salaries[0]; // инициализация первого элемента
        for (int salary = 0; salary < salaries.length; salary++){
            if (minSalaries > salaries[salary]){
                minSalaries = salaries[salary];
            }
        }
        return minSalaries;
    }

    public double getMaxSalaries (double[] salaries) {
        double maxSalaries = salaries[0]; // инициализация первого элемента
        for (int salary = 0; salary < salaries.length; salary++){
            if (maxSalaries < salaries[salary]){
                maxSalaries = salaries[salary];
            }
        }
        return maxSalaries;
    }

    public double getAverageSalary (double[] salaries) {
        double totalSalaries = getTotalSalaries(salaries);
        return totalSalaries / salaries.length;
    }

}
