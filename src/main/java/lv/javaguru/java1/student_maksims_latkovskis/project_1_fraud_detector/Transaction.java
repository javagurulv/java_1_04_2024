package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount){

        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getAmount(){
        return this.amount;
    }

}
