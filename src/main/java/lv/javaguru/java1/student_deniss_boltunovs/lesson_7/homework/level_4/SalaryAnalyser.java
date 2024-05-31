package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_4;

class SalaryAnalyser {

     double totalSalary(double[] salaries) {
         double total = 0;
         for (double salary : salaries){
              total += salary;
         }
          return total;
     }

     double minSalary(double[] salaries){
         double min = salaries[0];
         for (double salary : salaries) {
             min = Math.min(min, salary);
         }
         return min;
     }

     double maxSalary(double[] salaries){
         double max = salaries[0];
         for (double salary : salaries){
             max = Math.max(max, salary);
         }
         return max;
     }

     double avgSalary(double[] salaries){
         if(salaries.length == 0) {
             return 0;
         } else {
             double total = totalSalary(salaries);
             return total / salaries.length;
         }
     }

     double standardDeviation(double[] salaries){
         double average = avgSalary(salaries);
         double sumOfSquares = 0;

         for (double salary : salaries){
             sumOfSquares += Math.pow((salary - average),2);
         }

         double avgSumOfSquares = sumOfSquares / salaries.length;
         return Math.sqrt(avgSumOfSquares);
     }

}
