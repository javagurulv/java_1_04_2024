package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_5;

class Bank {

    private int withdrawalAmount ;
    private int commissionRate;
    private double commissionAmount;

    public Bank() {}

    public int getWithdrawAmount() {
        return this.withdrawalAmount;
    }

    public int getCommissionRate() {
        return this.commissionRate;
    }

    public double getCommissionAmount() {
        return this.commissionAmount;
    }

    public void commissionCalculate(int withdrawalAmount) {

        int commissionRate = 0;

        if (withdrawalAmount >= 5000) {
            commissionRate = 5;
        } else if (withdrawalAmount >= 1000) {
            commissionRate = 4;
        }  else {
            commissionRate = 3;
        }

        this.withdrawalAmount = withdrawalAmount;
        this.commissionRate = commissionRate;
        this.commissionAmount = (double) withdrawalAmount * commissionRate / 100 ;

    }

}
