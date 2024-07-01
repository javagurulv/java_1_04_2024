package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_5_middle;

class Cash {
    private int cash;
    private double commission;

    public Cash () {
        this.cash = 0;
        this.commission = 0;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public double cashWithdrawal(int cash) {
        if (cash < 1000) {
            this.cash = cash;
            this.commission = cash * 0.03;
        }
        else if (cash >= 1000 && cash < 5000) {
            this.cash = cash;
            this.commission = cash * 0.04;
        }
        else if (cash >= 5000) {
            this.cash = cash;
            this.commission = cash * 0.05;
        }
        return commission;
    }
    public void printCashWithdrawal() {
        System.out.println("Вы хотите снять: " + getCash());
        System.out.println("Ваша комиссия: " + getCommission());
    }

}
