package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_5_middle;

class CompoundInterestCalculatorApplication {

    public static void main(String[] args) {

        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();

        double principalAmount = 1000;
        double annualRate = 0.03;
        int timesCompounded = 4;
        int years = 5;

        double amount = compoundInterestCalculator.calculateCompoundInterest(principalAmount, annualRate, timesCompounded, years);

        System.out.println("After " +  years  + " years: " + amount);

    }

}
