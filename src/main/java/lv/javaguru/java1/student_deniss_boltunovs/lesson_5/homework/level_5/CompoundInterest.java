package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_5;

class CompoundInterest {

   public void calculateInterest(int principal,
                                   double rate,
                                   int frequency,
                                   int period) {

//     principal - initial principal amount invested;
//     rate - annual interest rate;
//     frequency - how often interests are paid annually (quarterly then 4, semi-annually then 2 etc.)
//     period - total investments period in years

     double compoundRate = 1 + rate / frequency;
     double compoundPeriods = frequency * period;
     double finalAmount = principal * Math.pow(compoundRate, compoundPeriods);
     double totalInterest = finalAmount - principal;

     System.out.println("Invested amount: " + principal);
     System.out.println("Final amount: " + finalAmount);
     System.out.println("Total interest: " + totalInterest + "\n");

   }

}
