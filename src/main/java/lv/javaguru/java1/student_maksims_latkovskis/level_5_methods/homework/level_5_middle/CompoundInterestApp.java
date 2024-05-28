package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_5_middle;

class CompoundInterestApp {

    public static void main(String[] args){
        CompoundInterest compoundInterest = new CompoundInterest();

        System.out.println("Assume you put 100 USD for the year interest rate of 2.5% for 50 years. You will get: ");
        System.out.println(compoundInterest.totalBalance(100, 0.025, 50));

        System.out.println("Now assume you put the same 100 USD for 50 years, but the interest rate of 2.5% paid four times a year. You will get: ");
        System.out.println(compoundInterest.totalBalance(100, 0.025, 50,4));
    }


}
