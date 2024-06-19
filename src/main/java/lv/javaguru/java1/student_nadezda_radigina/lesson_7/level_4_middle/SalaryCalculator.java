package lv.javaguru.java1.student_nadezda_radigina.lesson_7.level_4_middle;

class SalaryCalculator {
  public static double findTotalSalary(double[] salaries) {
   double totalSalary = 0.0;
      for (int i = 0; i < salaries.length; i++){
    totalSalary += salaries[i];
  }
   return totalSalary;
  }
  public double findMinSalary(double[] salaries){
   double minSalary = salaries[0];
   for (int i = 0; i < salaries.length; i++){
    if (minSalary > salaries[i]){
     minSalary = salaries[i];
    }
   }
   return minSalary;
  }
  public double findMaxSalary(double[] salaries){
   double maxSalary = 0.0;
   for (int i = 0; i < salaries.length; i++){
    if (maxSalary < salaries[i]){
     maxSalary = salaries[i];
    }
   }
   return maxSalary;
  }
 public static double calculateAverageSalary(double[] salaries){
   double totalSalaries = findTotalSalary(salaries);
  if (salaries.length == 0){
   return 0.0;
  } else {
   return totalSalaries / salaries.length;
  }
  }
}





