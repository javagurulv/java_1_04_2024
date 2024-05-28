package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

public class HardOne {
    public static double calculateCompoundInterest(double principal, double rate, int timesCompounded, int years) {
        return principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
    }

    public static void main(String[] args) {

        double principal = 1000.0; // Первоначальная сумма
        double rate = 0.05; // Процентная ставка (5%)
        int timesCompounded = 4; // Количество начислений в год (ежеквартально)
        int years = 10; // Количество лет


        double amount = calculateCompoundInterest(principal, rate, timesCompounded, years);
        System.out.println("Principal: " + principal + ", Rate: " + rate + ", Times Compounded: " + timesCompounded + ", Years: " + years + " -> Amount: " + amount);


        double[] principals = {500, 1500, 2000};
        double[] rates = {0.03, 0.04, 0.06};
        int[] timesCompoundedArr = {1, 2, 12};
        int[] yearsArr = {5, 7, 15};

        for (int i = 0; i < principals.length; i++) {
            double p = principals[i];
            double r = rates[i];
            int n = timesCompoundedArr[i];
            int t = yearsArr[i];
            double amt = calculateCompoundInterest(p, r, n, t);
            System.out.println("Principal: " + p + ", Rate: " + r + ", Times Compounded: " + n + ", Years: " + t + " -> Amount: " + amt);
        }
    }
}
