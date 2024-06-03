package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_5_middle;


class CompoundInterestCalculatorApp {
    public static void main(String[] args) {
        CompoundInterest interest = new CompoundInterest();
        System.out.println("Examples of compound interest if 10000 is invested with 10% interest over 5 time periods");
        System.out.println("Annually Compounded: " + interest.calculateFinalAmount(10000,0.1,1,5));
        System.out.println("Semi-annually Compounded: " + interest.calculateFinalAmount(10000,0.1,2,5));
        System.out.println("Quarterly Compounded: " + interest.calculateFinalAmount(10000,0.1,4,5));
        System.out.println("Monthly Compounded: " + interest.calculateFinalAmount(10000,0.1,12,5));
        System.out.println("Weekly Compounded: " + interest.calculateFinalAmount(10000,0.1,52,5));
        System.out.println("Daily Compounded: " + interest.calculateFinalAmount(10000,0.1,365,5));

    }
}
