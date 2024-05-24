package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_5_middle;

 class CompoundInterest {

     public static double compoundInterestFormula (double initialСapital, double rate, int numberOfAccruals, int years){
         return initialСapital * Math.pow( 1 + rate / numberOfAccruals, numberOfAccruals * years);
     }
}
